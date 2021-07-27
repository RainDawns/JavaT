package jiepu.xml.homework;
import org.dom4j.Document;
import  org.dom4j.io.SAXReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.dom4j.Element;
import org.dom4j.Attribute;
/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月08日 16:02
 */
public class Test05 {
    public static void main(String[] args) {
        String path="src/jiepu/xml/homework/Teacher.xml";
        output(path);
        duqu(path);
        you();
    }
    public static void output(String path) {
        try {
            Document document = org.dom4j.DocumentHelper.createDocument();
            Element root = document.addElement("teachers");
            Element teacher1 = root.addElement("teacher")
                    .addAttribute("id","1")
                    .addAttribute("地区","南昌");
            Element name1=teacher1.addElement("name").addText("张三")
                    .addAttribute("类别","中文");
            Element salary1=teacher1.addElement("salary").addText("10000");
            Element age1=teacher1.addElement("age").addText("25");
            Element teacher2 = root.addElement("teacher")
                    .addAttribute("id","34")
                    .addAttribute("地区","上海");
            Element name2=teacher2.addElement("name").addText("Hugo")
                    .addAttribute("类别","English");
            Element salary2=teacher2.addElement("salary").addText("20000");
            Element age2=teacher2.addElement("age").addText("23");
            FileWriter out = new FileWriter(path);
            org.dom4j.io.OutputFormat format = org.dom4j.io.OutputFormat.createPrettyPrint();
            org.dom4j.io.XMLWriter writer = new org.dom4j.io.XMLWriter(out,format);
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void duqu(String path){
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(path);
            System.out.println("<"+document.getRootElement().getName()+">");
            huoqu(document.getRootElement());
            System.out.println("</"+document.getRootElement().getName()+">");
        } catch (org.dom4j.DocumentException e) {
            e.printStackTrace();
        }
    }
    public static void huoqu(org.dom4j.Element e){
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

    public  static void you(){
        System.out.println(667+898);
    }

}
