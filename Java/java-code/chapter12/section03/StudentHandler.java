package chapter12.section03;

// chapter12/section03/StudentHandler.java
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
public class StudentHandler extends DefaultHandler {
    private boolean isName;
    private boolean isAge;
    private boolean isGender;

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) {
        if (qName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            isAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            isGender = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        if (qName.equalsIgnoreCase("student")) {
            System.out.println();
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (isName) {
            System.out.println("Name: " + new String(ch, start, length));
            isName = false;
        } else if (isAge) {
            System.out.println("Age: " + new String(ch, start, length));
            isAge = false;
        } else if (isGender) {
            System.out.println("Gender: " + new String(ch, start, length));
            isGender = false;
        }
    }
}
