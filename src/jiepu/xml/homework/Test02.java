package jiepu.xml.homework;

import org.dom4j.DocumentException;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Iterator;
import java.util.Map;

/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月07日 20:01
 */
public class Test02 {
    public static void main(String[] args) {
        Domout("src/jiepu/xml/homework/userrecord.xml");
    }


    public static void Domout(String path){
//       获取需要存放得数据
        String url = "src/jiepu/xml/homework/user.xml";
        Map<String, Double> map = Test01.domTotal(url);
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            try {
                DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
                Document document = documentBuilder.newDocument();
                Element root = document.createElement("records");
                Element recordNode1 = document.createElement("record");
                Element nameNode1 = document.createElement("name");
                Element priceode1 = document.createElement("price");
                Element recordNode2 = document.createElement("record");
                Element nameNode2 = document.createElement("name");
                Element priceode2 = document.createElement("price");
                Iterator<String> iterator = map.keySet().iterator();
                int i=0;
                Element[] name= {nameNode1,nameNode2};
                Element[] price= {priceode1,priceode2};
                for (Iterator<String> it = iterator ; it.hasNext(); i++) {
                    String s = it.next();
                    name[i].setTextContent(s);
                    price[i].setTextContent(String.valueOf(map.get(s)));
                }
                recordNode1.appendChild(nameNode1);
                recordNode1.appendChild(priceode1);
                recordNode2.appendChild(nameNode2);
                recordNode2.appendChild(priceode2);
                document.appendChild(root);
                root.appendChild(recordNode1);
                root.appendChild(recordNode2);
                createXMLByDocument(document,path);
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
        }
        public static void createXMLByDocument(Document document,String filePath) {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            try {
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.transform(new DOMSource(document), new StreamResult(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

