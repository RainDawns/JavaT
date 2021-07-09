package jiepu.xml.Day02.saxj;
/**
 * @author lnh<br />
 * @version
 */

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author lnh
 * @date 2021年07月07日 11:26
 */
public class Test01 {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            saxParser.parse("src/jiepu/xml/Day02/book.xml",new MyHander());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class MyHander extends DefaultHandler{
    private List<String> list=new ArrayList<>();
    @Override
    public void startDocument() throws SAXException {
//        System.out.println();
    }

    @Override
    public void endDocument() throws SAXException {
//        super.endDocument();
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//        uri ：前缀   localname:命名空间
//        System.out.println(uri);
//        System.out.println(localName);
        if (attributes.getLength()==0){
            System.out.print("<"+qName+">");
        }else{
            System.out.print("<"+qName+" ");
            for (int i = 0; i <attributes.getLength() ; i++) {
                System.out.print(attributes.getLocalName(i)+"= '"+attributes.getValue(i)+"' ");
            }
            System.out.print(">");
            if (qName.equals("price")){
            }
        }
//        System.out.println(attributes);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.print("<"+qName+">");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.print(new String(ch,start,length));
    }
}