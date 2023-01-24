package Aufgabe_6;

import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.ST;

import java.awt.*;
import java.io.*;

public class GenerateDoc {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Class[] classes = {Class.forName("java.lang.String"), Class.forName("java.util.Iterator"), Class.forName("java.time.Month")};
        ST template = new STGroupFile("doc.stg").getInstanceOf("doc");
        template.add("c"
                , classes);
        String htmlSeite
                = template.render();
        PrintWriter writer = new PrintWriter("classes.html", "UTF-8");
        writer.write(htmlSeite);
        writer.close();
        File htmlFile = new File("classes.html");
        classes[1].isInterface();
        Desktop.getDesktop().browse(htmlFile.toURI());
    }
}
