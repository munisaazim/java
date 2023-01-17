package org.example;

import java.util.Timer;

public class RefreshPage extends DriverCheck{
    public void refreshPage() throws InterruptedException {
        driver.navigate().refresh();
    }
}
