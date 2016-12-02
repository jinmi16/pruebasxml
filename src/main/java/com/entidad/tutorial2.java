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
public class tutorial2 {
    public static void main(String[] args) {
		XStream stream = new XStream();
		stream.processAnnotations(RendezvousMessage.class);
		RendezvousMessage msg = new RendezvousMessage(15, "firstPart","secondPart");
		System.out.println(stream.toXML(msg));
	}
    
}
