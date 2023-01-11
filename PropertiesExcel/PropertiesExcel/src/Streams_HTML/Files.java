package Streams_HTML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
       File f = new File("//Users//munisaazimkhodjaeva//IntelliJ IDEA//Java_Programming//PropertiesExcel//PropertiesExcel//src//config2//myfiles.html");
       FileWriter fw = new FileWriter(f);
       BufferedWriter writer = new BufferedWriter(fw);

       writer.write("Hello");
       writer.newLine();
       writer.write(" World");

       writer.close();

       System.out.println("HTML file is created");

    }
}
