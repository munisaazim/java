package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main extends DriverCheck {
    public static void main(String[] args) throws InterruptedException {
        Login object = new Login();
        EnteredPage objectMain = new EnteredPage();
        ForgotPassword objectForgotPassword = new ForgotPassword();
        CheckSuccessLogin success = new CheckSuccessLogin();
        objectMain.enteredPage();
        objectForgotPassword.forgotPassword();
        object.loginWithoutOnBoardingWithButton();
        success.checkSuccessLogin();
        success.goToDashboard();
        success.profileLogout();
        driver.quit();
    }

}