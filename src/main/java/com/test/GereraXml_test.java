/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author virtual
 */
public class GereraXml_test {
    
    
    
    public static void main(String[] args) {
        
        System.out.println(""+generaXml());
        
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

            DOMSource source = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult consoleResult = new StreamResult(writer);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.transform(source, consoleResult);
            String strResult = writer.toString();
            System.out.println(""+strResult);
            
   
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    return strXml;
    }
    
    
    
    
    
    
}
