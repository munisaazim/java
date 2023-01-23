package org.example;

import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ScrollPage object = new ScrollPage();
        //object.scrollPage();
        BadSSL sslObject = new BadSSL();
        BrokenLink brokenLinkObject = new BrokenLink();
        brokenLinkObject.brokenLink();
        //sslObject.badSSL();
        //DeleteCookie deleteCookieObject = new DeleteCookie();
        //deleteCookieObject.maximimizeAndDeleteCookie();



    }
}