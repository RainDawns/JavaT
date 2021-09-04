package systematicLearn.xml.homework;

import org.w3c.dom.*;
import org.xml.sax.*;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParserFactory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import java.io.IOException;
import java.util.*;

/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月07日 18:49
 */
public class Test01 {
    public static void main(String[] args) {
        String url = "src/jiepu/xml/homework/user.xml";
        Map<String, Double> stringDoubleMap = domTotal(url);
        Set<Map.Entry<String, Double>> entries = stringDoubleMap.entrySet();
        for (Map.Entry<String, Double>  set: entries) {
            System.out.println(set);
        }
        System.out.println(">>>>>>");
        Map<String, Double> stringDoubleMap1 = saxjTotal(url);
        Set<Map.Entry<String, Double>> entries1 = stringDoubleMap1.entrySet();
        for (Map.Entry<String, Double>  set: entries1) {
            System.out.println(set);
        }


    }

    public static Map<String,Double> domTotal(String url) {
        HashMap<String,Double> map=new HashMap<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(url);
            Element root = document.getDocumentElement();
            NodeList childNodes = root.getChildNodes();
            for (int i = 0; i <childNodes.getLength() ; i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType()==Node.ELEMENT_NODE) {
                    NamedNodeMap attributes = item.getAttributes();
                    for (int j = 0; j < attributes.getLength(); j++) {
                        if (attributes.item(j).getNodeName().equals("name")) {
                            if (map.containsKey(attributes.item(j).getNodeValue())) {
                                double v = map.get(attributes.item(j).getNodeValue()) + Double.parseDouble(item.getTextContent());
                                map.put(attributes.item(j).getNodeValue(), v);
                            } else {
                                map.put(attributes.item(j).getNodeValue(), Double.parseDouble(item.getTextContent()));
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static Map<String,Double> saxjTotal(String path){
        SAXParserFactory saxParserFactory =
                SAXParserFactory.newInstance();
        HashMap<String,Double> map=new HashMap<>();
        try {

            SAXParser saxParser =
                    saxParserFactory.newSAXParser();
            Myhander my=new Myhander();
            saxParser.parse(path,my );
            List<String> s = my.s;
            for (int i = 1; i < s.size()-1; i=i+3) {
                int x=i+1;
                if (map.containsKey(s.get(i))) {
                    double v = map.get(s.get(i)) +Double.parseDouble(s.get(x));
                    map.put(s.get(i),v );
                } else {
                    map.put(s.get(i),Double.parseDouble(s.get(x)));
                }
            }
            return map;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
class Myhander extends DefaultHandler{
    public List<String> s=new ArrayList<>();
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        for (int i = 0; i <attributes.getLength() ; i++) {
            if (attributes.getQName(i).equals("name")){
                s.add(attributes.getValue(i));
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        s.add(new String(ch,start,length));
    }
}