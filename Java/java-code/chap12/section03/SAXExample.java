package chap12.section03;

// chap12/section03/SAXExample.java
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXExample {
    public static void main(String[] args) {
        try {
            File file = new File("chap12/section03/student.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            StudentHandler handler = new StudentHandler();
            saxParser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
