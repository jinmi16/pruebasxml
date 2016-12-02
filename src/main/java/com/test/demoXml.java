/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.ByteArrayInputStream;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class demoXml {

    public static void main(String[] args) {

        try {
            
            String xml="<? Xml version = \"1.0\"?>\n" +
"<Clase>\n" +
"   <Estudiante rollno = \"393\">\n" +
"      <Apellido> Dinkar </ apellido>\n" +
"      <Apellido> kad </ apellido>\n" +
"      <Apodo> Dinkar </ apodo>\n" +
"      <marcas> 85 </ marcas>\n" +
"   </ Estudiante>\n" +
"   <Estudiante rollno = \"493\">\n" +
"      <Apellido> Vaneet </ apellido>\n" +
"      <Apellido> Gupta </ ​​apellido>\n" +
"      <Apodo> vinni </ apodo>\n" +
"      <marcas> 95 </ marcas>\n" +
"   </ Estudiante>\n" +
"   <Estudiante rollno = \"593\">\n" +
"      <Apellido> Jasvir </ apellido>\n" +
"      <Apellido> singn </ apellido>\n" +
"      <Apodo> jazz </ apodo>\n" +
"      <marcas> 90 </ marcas>\n" +
"   </ Estudiante>\n" +
"</ Class>";
            //File inputFile = new File("D:\\xml\\input2.text");
            File inputFile = new File("D:\\xml\\input2.text");
            
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            //Document doc =DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes())) ;
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("student");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :"+ nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
                    System.out.println("First Name : "  + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : "+ eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nick Name : "+ eElement.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Marks : "+ eElement.getElementsByTagName("marks").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
