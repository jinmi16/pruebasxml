/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.entidad.Persona;
import com.thoughtworks.xstream.XStream;

/**
 *
 * @author virtual
 */
public class test_XStram {

    public static void main(String[] args) {

        String xml = objForXmlString();
        System.out.println(xml);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
        Persona per = XmlStringForObject(xml);
        System.out.println("ID:" + per.getId());
        System.out.println("NOMBRE:" + per.getNombre());
        System.out.println("APELLIDO:" + per.getApellido());
        System.out.println("DNI:" + per.getDni());

    }

    public static String objForXmlString() {
        XStream xmlXStram = new XStream();
        Persona per = new Persona();
        per.setId(1);
        per.setNombre("jinmi");
        per.setApellido("vega");
        per.setDni("44617765");
       // xmlXStram.alias ( "persona", Persona.class);
        return xmlXStram.toXML(per);

    }

    public static Persona XmlStringForObject(String xml) {
        XStream xmlXStram = new XStream();

        return (Persona) xmlXStram.fromXML(xml);

    }

}
