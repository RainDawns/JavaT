package jiepu.xml.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.dom4j.io.OutputFormat;
/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月08日 15:19
 */
public class Test03 {
    public static void main(String[] args) {
        dom4jOut("src/jiepu/xml/homework/userecord2.xml");
    }
    public static void dom4jOut(String  path){
        String url = "src/jiepu/xml/homework/user.xml";
        Map<String, Double> map = Test01.domTotal(url);
        try {
            Set<String> set = map.keySet();
            ArrayList<String> names = new ArrayList<>(set);
            Document document = org.dom4j.DocumentHelper.createDocument();
            Element root = document.addElement("records");
            Element author1 = root.addElement("record");
            Element name1=author1.addElement("name").addText(names.get(0));
            Element price1=author1.addElement("price").addText(String.valueOf(map.get(names.get(0))));
            Element author2 = root.addElement("record");
            Element name2=author2.addElement("name").addText(names.get(1));
            Element price2=author2.addElement("price").addText(String.valueOf(map.get(names.get(1))));
            FileWriter out = new FileWriter(path);
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter writer = new XMLWriter(out,format);
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
