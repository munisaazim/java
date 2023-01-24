package org.example;


import java.io.IOException;

public class Main extends GetDriver{
    public static void main(String[] args) throws IOException {

        //System.out.println("Hello world!");
        Mouse mouse = new Mouse();
        ExartractChildAndParent childAndParent = new ExartractChildAndParent();
        CountLinks countLinks = new CountLinks();
        CookieAndScrollAndBrokenLink cookieAndScrollAndBrokenLink = new CookieAndScrollAndBrokenLink();
        GetDriver getDriver = new GetDriver();
        getDriver.enterPage();
        cookieAndScrollAndBrokenLink.maximizeWindow();
        cookieAndScrollAndBrokenLink.cookieAndScrollAndBrokenLink();
        /*
        mouse.mouseLoginMove();
        childAndParent.childAndParent();
        countLinks.countLinks();
        countLinks.clickInnerFootElement()
         */
        quit();

    }
}