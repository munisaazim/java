package org.example;

public class EnterMainPage extends DriverCheck{
    public void enteredPage(){
        driver.get("https://staging.engineer.ai/home");
    }
}
