package org.example;

public class EnteredPage extends DriverCheck{
    public void enteredPage(){
        driver.get("https://staging.engineer.ai/home");
    }
}
