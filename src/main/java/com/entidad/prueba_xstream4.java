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
public class prueba_xstream4 {
    public static void main(String[] args) {
        
        Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
        teamBlog.add(new Entry("first","My first blog entry."));
        teamBlog.add(new Entry("tutorial",
                "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

        XStream xstream = new XStream();
       // xstream.aliasPackage("my.company", "org.thoughtworks");
        xstream.aliasPackage("org.iteamdevs.peru", "com.entidad");
       // xstream.aliasPackage(name, pkgName);
        System.out.println(xstream.toXML(teamBlog));

    }
}
