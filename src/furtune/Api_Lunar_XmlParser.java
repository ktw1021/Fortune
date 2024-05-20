package furtune;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class Api_Lunar_XmlParser {
	
	
	public void parseXmlString(String xmlStr, double inputHour) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xmlStr));
        Document doc = builder.parse(is);

        NodeList nodeList = doc.getElementsByTagName("item");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                
                String lunYear	= element.getElementsByTagName("lunYear").item(0).getTextContent();
                String lunMonth	= element.getElementsByTagName("lunMonth").item(0).getTextContent();
                String lunDay	= element.getElementsByTagName("lunDay").item(0).getTextContent();
                String iljin	= element.getElementsByTagName("lunIljin").item(0).getTextContent();
                
                
                System.out.printf("음력 %s년 %s월 %s일 %s%n",lunYear,lunMonth,lunDay,iljin);
                System.out.println("요일: " + element.getElementsByTagName("solWeek").item(0).getTextContent());
                System.out.println("윤달 여부: " + element.getElementsByTagName("lunLeapmonth").item(0).getTextContent());
                System.out.println("-------------------------------------------------");
                
                //	GapJa 클래스 호출
            	GapJa.transformer(lunYear,lunMonth,iljin,inputHour);
                
            	
            }
        }
    }


		
	
	
	
	
}
