/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



/**
 *
 * @author mzavaleta
 */
public class leerStrinXml {

    public static void main(String[] args) throws SAXException, IOException {
        String cadenaXML =
                "<productos>"
                + "<producto>"
                + "<nombre>Televisor LCD 32'</nombre>"
                + "<precio>3500</precio>"
                + "<stock>5</stock>"
                + "<marca>SONY</marca>"
                + "</producto>"
                + "<producto>"
                + "<nombre>Pantalon jean azul</nombre>"
                + "<precio>159</precio>"
                + "<stock>200</stock>"
                + "<marca>Levis</marca>"
                + "</producto>"
                + "<producto>"
                + "<nombre>Colchon ortopedico King Size</nombre>"
                + "<precio>1250</precio>"
                + "<stock>1</stock>"
                + "<marca>Paraiso</marca>"
                + "</producto>"
                + "</productos>";
        DOMParser parser = new DOMParser();
        parser.parse(new InputSource(new java.io.StringReader(cadenaXML)));


        Document doc = parser.getDocument();
        NodeList nodeLst = doc.getElementsByTagName("producto");
       
     
//        for (int i = 0; nodeLst.getLength(); i++) {
//            Element eleProducto = (Element) nodeLst.item(i);
//
//
//            NodeList nlsNombre = eleProducto.getElementsByTagName("nombre");
//            Element eleNombre = (Element) nlsNombre.item(0);
//            String strNombre = eleNombre.getFirstChild().getNodeValue();
//
//
//            NodeList nlsPrecio = eleProducto.getElementsByTagName("precio");
//            Element elePrecio = (Element) nlsPrecio.item(0);
//            String strPrecio = elePrecio.getFirstChild().getNodeValue();
//
//
//            NodeList nlsStock = eleProducto.getElementsByTagName("stock");
//            Element eleStock = (Element) nlsStock.item(0);
//            String strStock = eleStock.getFirstChild().getNodeValue();
//
//
//            NodeList nlsMarca = eleProducto.getElementsByTagName("marca");
//            Element eleMarca = (Element) nlsMarca.item(0);
//            String strMarca = eleMarca.getFirstChild().getNodeValue();
//
//
//
//
//            System.out.println("Producto:");
//            System.out.println("*********");
//            System.out.println("   Nombre      : " + strNombre);
//            System.out.println("   Precio (S/.): " + strPrecio);
//            System.out.println("   Stock (Und) : " + strStock);
//            System.out.println("   Marca       : " + strMarca);
//        }
    }
}

