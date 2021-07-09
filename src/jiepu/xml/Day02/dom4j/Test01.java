package jiepu.xml.Day02.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import javax.xml.transform.Source;
import java.util.Iterator;
import java.util.List;

/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月07日 14:02
 */
public class Test01 {
    public static void main(String[] args) {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read("src/jiepu/xml/Day02/book.xml");
//            Element root = document.getRootElement();
//            System.out.println("<" + root.getName() + ">");
            System.out.println("<"+document.getRootElement().getName()+">");
            huoqu(document.getRootElement());
            System.out.println("</"+document.getRootElement().getName()+">");
            /*for (Iterator<Element> it = root.elementIterator(); it.hasNext(); ) {
                Element element = it.next();
                System.out.print("<" + element.getName() + " ");
                List<Attribute> attributes = element.attributes();
                for (Attribute a : attributes) {
                    System.out.print(a.getName() + "='" + a.getValue() + "'>");
                }
                System.out.print(element.getText());
                System.out.println("</" + element.getName() + ">");
            }*/
        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }


    /*
    *   List<Element> elements = element.elements();
                if (elements.size() == 0) {
                    System.out.print(element.getText());
                    System.out.println("</" + element.getName() + ">");
                } else {
                    for (Element e : elements) {
                        System.out.print("<" + element.getName() + " ");
                        List<Attribute> attributes1 = element.attributes();
                        for (Attribute a : attributes1) {
                            System.out.print(a.getName() + "='" + a.getValue() + "'>");
                        }

                        List<Element> elements1 = element.elements();
                        if (elements1.size() == 0) {
                            System.out.print(element.getText());
                            System.out.println("</" + element.getName() + ">");
                        }
                    }
                }*/
    public static void huoqu(Element e){
        List<Element> elements = e.elements();
        for (Element ele:elements) {
                System.out.print("<" + ele.getName()+" " );
                List<Attribute> attributes = ele.attributes();
                for (Attribute a : attributes) {
                    System.out.print(a.getName() + "='" + a.getValue() + "' ");
                }
                System.out.print(">");
                if (!"".equals(ele.getText().trim())){
                    System.out.print(ele.getText());
                }
                huoqu(ele);
                System.out.println("</" + ele.getName() + ">");
        }
    }
}
