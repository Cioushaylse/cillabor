import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class Main {
    public static void main(String[] args) {
        try {
            String xmlData = "<root><study_first_submitted>2024-06-22</study_first_submitted></root>";

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlData)));

            NodeList nodeList = doc.getElementsByTagName("study_first_submitted");
            Element element = (Element) nodeList.item(0);
            String firstSubmissionDate = element.getTextContent();

            System.out.println(firstSubmissionDate);  // Output: 2024-06-22
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
