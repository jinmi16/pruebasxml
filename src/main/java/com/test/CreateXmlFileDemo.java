package com.test;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.stream.StreamSource;

public class CreateXmlFileDemo {

    public static void main(String argv[]) {


    }
    
    public static String generaXml(){
        String strXml="";
                try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // root element
            Element rootElement = doc.createElement("cars");
            doc.appendChild(rootElement);

            //  supercars element
            Element supercar = doc.createElement("supercars");
            rootElement.appendChild(supercar);

            // setting attribute to element
            Attr attr = doc.createAttribute("company");
            attr.setValue("Ferrari");
            supercar.setAttributeNode(attr);

            // carname element
            Element carname = doc.createElement("carname");
            Attr attrType = doc.createAttribute("type");
            attrType.setValue("formula one");
            carname.setAttributeNode(attrType);
            carname.appendChild(doc.createTextNode("Ferrari 101"));
            supercar.appendChild(carname);

            Element carname1 = doc.createElement("carname");
            Attr attrType1 = doc.createAttribute("type");
            attrType1.setValue("sports");
            carname1.setAttributeNode(attrType1);
            carname1.appendChild(
                    doc.createTextNode("Ferrari 202"));
            supercar.appendChild(carname1);
//***************************------------------------------------------------------------------
            // write the content into xml file
//            TransformerFactory transformerFactory = TransformerFactory.newInstance();
//            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            // StreamResult result = new StreamResult(new File("D:\\cars.xml"));
            // transformer.transform(source, result);
            // Output to console for testing
           // StreamResult consoleResult = new StreamResult(System.out);
           
              StringWriter writer = new StringWriter();
            StreamResult consoleResult = new StreamResult(writer);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            transformer.transform(source, consoleResult);
            
         
            String strResult = writer.toString();
            System.out.println(""+strResult);
            
            

/*------------------------------------------------------------------------------------------  
            try {
                
                StreamSource source2 = new StreamSource(new StringReader("<xml>blabla</xml>"));
                StringWriter writer2 = new StringWriter();
                StreamResult result = new StreamResult(writer2);
                TransformerFactory tFactory = TransformerFactory.newInstance();
                Transformer transformer2 = tFactory.newTransformer();
                transformer2.transform(source2, result);
                String strResult2 = writer2.toString();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    return strXml;
    }
    
}
