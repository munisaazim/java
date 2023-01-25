package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTestNG3 {

    @AfterTest
    public void afterTest(){
        System.out.println("Class ExampleTestNG3- ---->afterTest");
    }
    @Test
    public void Mobile1(){
        System.out.println("Mobile1");
    }
    @Test
    public void Mobile2(){
        System.out.println("Mobile2");
    }
    @Test
    public void Mobile3(){
        System.out.println("Mobile3");
    }
    @Test
    public void Mobile4(){
        System.out.println("Mobile4");
    }
    @Test
    public void Mobile5(){
        System.out.println("Mobile5");
    }
    @Test
    public void Show(){
        System.out.println("Show answer");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Class ExampleTestNG3--->beforeTest");
    }
}
