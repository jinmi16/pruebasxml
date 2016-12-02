/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidad;
import com.thoughtworks.xstream.XStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author virtual
 */
public class prueba_xtream2 {
    
    public static void main(String[] args) {
          Blog teamBlog = new Blog(new Author("Guilherme Silveira"));
                teamBlog.add(new Entry("first","My first blog entry."));
                teamBlog.add(new Entry("tutorial", "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));

                XStream xstream = new XStream();
                xstream.alias("blog", Blog.class);
                xstream.alias("entry", Entry.class);
 /*
Ahora vamos a poner en práctica lo que se llama una colección implícita : cada vez que tenga una colección que no necesita mostrar que es etiqueta raíz, puede asignar como una colección implícita.
En nuestro ejemplo, no queremos para mostrar la entradas de la etiqueta, sino simplemente mostramos las principales etiquetas una tras otra.
Una simple llamada a la addImplicitCollection método deberá configurar xstream y hacerle saber que no queremos escribir la entradas de la etiqueta como se ha descrito anteriormente:
*/

                xstream.addImplicitCollection(Blog.class, "entries");
           
                System.out.println(xstream.toXML(teamBlog));
    }
    
}
