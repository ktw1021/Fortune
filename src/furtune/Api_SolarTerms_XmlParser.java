package furtune;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.StringReader;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Api_SolarTerms_XmlParser {

	public static List<SolarTerm> parseXml(String xmlData) throws ParserConfigurationException, SAXException, IOException {
	    List<SolarTerm> solarTerms = new ArrayList<>();

	    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder builder = factory.newDocumentBuilder();
	    InputSource is = new InputSource(new StringReader(xmlData));
	    Document doc = builder.parse(is);
	    doc.getDocumentElement().normalize();

	    // items 태그의 존재 여부를 확인
	    NodeList itemsList = doc.getElementsByTagName("items");
	    if (itemsList.getLength() > 0 && itemsList.item(0).hasChildNodes()) {
	        NodeList nList = doc.getElementsByTagName("item");

	        for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);

	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                Element eElement = (Element) nNode;

	                String dateName = eElement.getElementsByTagName("dateName").item(0).getTextContent();
	                String locdate = eElement.getElementsByTagName("locdate").item(0).getTextContent();
	                SolarTerm solarTerm = new SolarTerm(dateName, locdate);
	                solarTerms.add(solarTerm);
	            }
	        }
	    } else {
	        System.out.println("No items found for the given period.");
	    }

	    return solarTerms;
	}
}