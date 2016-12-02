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
public class pruebas_xstream {

    public static void main(String[] args) {

        Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
        teamBlog.add(new Entry("first", "My first blog entry."));
        teamBlog.add(new Entry("tutorial","Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

        XStream xstream = new XStream();
        // configuracion de alias
        xstream.alias("blog", Blog.class);
        xstream.aliasField("author", Blog.class, "writer");
        xstream.alias("entrada", Entry.class);

        System.out.println(xstream.toXML(teamBlog));

    }

}
