/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import com.thoughtworks.xstream.XStream;

/**
 *
 * @author virtual
 */
public class Tutorial {

    public static void main(String[] args) {

        // por defecto no reconoce anotaciones 
        /*	XStream stream = new XStream();
		RendezvousMessage msg = new RendezvousMessage(15);
		System.out.println(stream.toXML(msg));
         */
///   ahora si reconoce anotaciones  
        XStream stream = new XStream();
        RendezvousMessage msg = new RendezvousMessage(15);
        stream.processAnnotations(RendezvousMessage.class);// para que reconosaca anotaciones
        System.out.println(stream.toXML(msg));

    }
}
