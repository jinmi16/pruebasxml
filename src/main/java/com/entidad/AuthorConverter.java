/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;

import com.thoughtworks.xstream.converters.SingleValueConverter;

/**
 *
 * @author virtual
 */
public class AuthorConverter implements SingleValueConverter {

    @Override
    public String toString(Object o) {
        return ((Author) o).getName();
    }

    @Override
    public Object fromString(String name) {
        return new Author(name);
    }

    @Override
    public boolean canConvert(Class type) {
        return type.equals(Author.class);
    }

}
