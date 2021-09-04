package systematicLearn.xml.homework;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author lnh
 * @date 2021年07月08日 15:39
 */
public class Test04 {
    public static void main(String[] args) {
        List<Book> pack = pack("src/jiepu/xml/homework/book.xml");
        pack.stream().forEach(System.out::println);
    }

    public static List<Book> pack(String  path){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        List<Book> list=new ArrayList<>();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(path);
            Element root = document.getDocumentElement();
            NodeList childNodes = root.getChildNodes();
            for (int i = 0; i <childNodes.getLength() ; i++) {
                Node item = childNodes.item(i);
                Book book=new Book();
                boolean flag=false;
                if (item.getNodeType()==Node.ELEMENT_NODE){
                    if (item.getNodeName().equals("book")){
                        NamedNodeMap attributes = item.getAttributes();
                        for (int j = 0; j <attributes.getLength() ; j++) {
                            if (attributes.item(j).getNodeName().equals("bid")){
                                book.setId(Integer.parseInt(attributes.item(j).getNodeValue()));
                                flag=true;
                            }
                        }
                        NodeList childNodes1 = item.getChildNodes();
                        for (int j = 0; j <childNodes1.getLength() ; j++) {
                            Node item1 = childNodes1.item(j);
                            if (item1.getNodeType()==Node.ELEMENT_NODE){
                                if (item1.getNodeName().equals("name")){
                                    book.setName(item1.getTextContent());
                                }else if (item1.getNodeName().equals("price")){
                                    book.setPrice(Double.valueOf(item1.getTextContent()));
                                }
                            }
                        }
                    }
                }
                if (flag){
                    list.add(book);
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return list;

    }
static class  Book {
    private int id;
    private String name;
    private Double price;

    public Book() {
    }

    public Book(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}}
