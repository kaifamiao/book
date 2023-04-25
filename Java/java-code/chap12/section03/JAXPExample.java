package chap12.section03;

// chap12/section03/JAXPExample.java
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class JAXPExample {
    public static void main(String[] args) {
        try {
            File file = new File("chap12/section03/student.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("student");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String age = element.getElementsByTagName("age").item(0).getTextContent();
                String gender = element.getElementsByTagName("gender").item(0).getTextContent();
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
