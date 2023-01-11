package test;

import java.io.FileInputStream;
import java.util.Properties;

public class TestCase1 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("//Users//munisaazimkhodjaeva//IntelliJ IDEA//Java_Programming//PropertiesExcel//PropertiesExcel//src//config//object.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        //System.out.println(System.getProperty("user.dir"));
    }

}
