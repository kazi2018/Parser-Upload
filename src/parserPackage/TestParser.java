package parserPackage;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;


public class TestParser {

    public static void main(String[] args) throws SAXException, IOException {

        XMLReader p = XMLReaderFactory.createXMLReader();
        p.setContentHandler(new parserHandler());
        p.parse("demo");

    }
}
