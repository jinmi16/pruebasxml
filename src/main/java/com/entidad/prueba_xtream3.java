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
public class prueba_xtream3 {

    public static void main(String[] args) {

        Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
        teamBlog.add(new Entry("first", "My first blog entry."));
        teamBlog.add(new Entry("tutorial",
                "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

        XStream xstream = new XStream();
        xstream.alias("blog", Blog.class);
        xstream.alias("entry", Entry.class);

        xstream.addImplicitCollection(Blog.class, "entries");

        xstream.useAttributeFor(Blog.class, "writer");
        xstream.aliasField("author", Blog.class, "writer");

       // xstream.useAttributeFor(Blog.class, "author");
        
        xstream.registerConverter(new AuthorConverter());

        System.out.println(xstream.toXML(teamBlog));

    }

}
