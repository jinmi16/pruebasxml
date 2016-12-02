/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author virtual
 */
public class Blog {

    private Author writer;
    private List<Entry> entries = new ArrayList();

    public Blog(Author writer) {
        this.writer = writer;
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    public List getContent() {
        return entries;
    }
}
