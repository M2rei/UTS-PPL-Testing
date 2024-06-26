package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminGaleriDeleteObject {
    public WebDriver driver;

    public AdminGaleriDeleteObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getdeletegaleriButton() {
        return By.id("button-clikdeletegaleri");
    }
}
