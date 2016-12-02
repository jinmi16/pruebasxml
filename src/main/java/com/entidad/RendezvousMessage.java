/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author virtual  http://x-stream.github.io/annotations-tutorial.html
 */
@XStreamAlias("Mensaje")
//@XStreamConverter(value=ToAttributedValueConverter.class, strings={"content"})

public class RendezvousMessage {

    @XStreamAlias("Tipo")
   // @XStreamAsAttribute
    private int messageType;
    //@XStreamImplicit
    @XStreamImplicit(itemFieldName = "part")
    private List<String> content;

    //************************************
   // @XStreamAsAttribute
    @XStreamConverter(value=BooleanConverter.class, booleans={false}, strings={"yes", "no"})
    private boolean important;
@XStreamConverter(SingleValueCalendarConverter.class)
    private Calendar created = new GregorianCalendar();
    
    public RendezvousMessage(int messageType, boolean important, String... content) {
		this.messageType = messageType;
		this.important = important;
		this.content = Arrays.asList(content);
	}

    public RendezvousMessage() {
    }

    public RendezvousMessage(int messageType) {
        this.messageType = messageType;
    }

    public RendezvousMessage(int messageType, String... content) {
        this.messageType = messageType;
        this.content = Arrays.asList(content);
    }

    public RendezvousMessage(int messageType, List<String> content) {
        this.messageType = messageType;
        this.content = content;
    }

}
