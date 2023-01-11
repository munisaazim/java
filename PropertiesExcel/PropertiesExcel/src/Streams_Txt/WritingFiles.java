package Streams_Txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) throws IOException {
        //Stream Connectivity
        File f = new File("//Users//munisaazimkhodjaeva//IntelliJ IDEA//Java_Programming//PropertiesExcel//PropertiesExcel//src//config2//myfiles.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter writer = new BufferedWriter(fw);

        //Writing inside file
        writer.write("Hi");
        writer.newLine();
        writer.write("Munisa");

        //Close stream
        writer.close();

        System.out.println("File Created");

    }
}
