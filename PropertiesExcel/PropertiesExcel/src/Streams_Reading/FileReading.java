package Streams_Reading;

import java.io.*;

public class FileReading {

    public static void main(String[] args) throws IOException {

        //Connecting to File
        File f = new File("//Users//munisaazimkhodjaeva//IntelliJ IDEA//Java_Programming//PropertiesExcel//PropertiesExcel//src//config2//myfiles.html");
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);

        //Reading 1st line
        System.out.println(reader.readLine());

        //Closing
        reader.close();
    }

}
