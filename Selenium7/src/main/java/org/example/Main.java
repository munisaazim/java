package org.example;


public class Main extends GetDriver{
    public static void main(String[] args){

        //System.out.println("Hello world!");
        Mouse mouse = new Mouse();
        ExartractChildAndParent childAndParent = new ExartractChildAndParent();
        CountLinks countLinks = new CountLinks();
        mouse.mouseLoginMove();
        childAndParent.childAndParent();
        countLinks.countLinks();
        countLinks.clickInnerFootElement();
        quit();

    }
}