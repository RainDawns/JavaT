package jiepu.xml.Day02.domparase;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author lnh
 * @date 2021年07月07日 10:01
 */
public class Test01 {
    public static void duqu(String path){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document parse = documentBuilder.parse(path);

            Element root = parse.getDocumentElement();
//            System.out.println("root"+root.getNodeType());
//
//            System.out.println("<"+root.getNodeName()+">");
//            NodeList childNodes = root.getChildNodes();
////            System.out.println(childNodes.getLength());
//            for (int i = 0; i <childNodes.getLength() ; i++) {
//                Node item = childNodes.item(i);
//                if (item.getNodeType()== Node.ELEMENT_NODE){
//                    System.out.print("<"+item.getNodeName()+"    ");
//                    NamedNodeMap attributes = item.getAttributes();
//                    for (int j = 0; j <attributes.getLength() ; j++) {
//                        System.out.print(attributes.item(j).getNodeName()+"='"+attributes.item(j).getNodeValue()+"'");
//                    }
//                    System.out.println(">");
//                    short nodeType = item.getNodeType();
//                    System.out.println("下面还有的"+nodeType);
//                    NodeList childNodes1 = item.getChildNodes();
//                    for (int j = 0; j < childNodes1.getLength(); j++) {
//                        Node item1 = childNodes1.item(j);
//                        System.out.println("下面无的"+item1.getNodeType());
//                    }
//
//                }
//
//            }
            huoqu(root);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url="src/jiepu/xml/Day02/book.xml";
        duqu(url);

    }
    public  static void huoqu(Node node) {
        if (node.getNodeType() == Node.TEXT_NODE) {
            System.out.print(node.getNodeValue());
        } else if (node.getNodeType() == Node.ELEMENT_NODE) {
            NamedNodeMap attributes = node.getAttributes();
            if (attributes.getLength() == 0) {
                System.out.print("<" + node.getNodeName() + ">");
            } else {
                System.out.print("<" + node.getNodeName() + "  ");
                for (int i = 0; i < attributes.getLength(); i++) {
                    System.out.print(attributes.item(i).getNodeName() + "='" + attributes.item(i).getNodeValue() + "' ");
                }
                System.out.print(">");
            }
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node no = childNodes.item(i);
                huoqu(no);
            }
            System.out.print("</" + node.getNodeName() + ">");
        }
    }
}
