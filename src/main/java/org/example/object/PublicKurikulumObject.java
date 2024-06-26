package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PublicKurikulumObject {
    public WebDriver driver;

    public PublicKurikulumObject(WebDriver driver){
        this.driver = driver;
    }
    public By Unduhfile() {
        return By.id("unduh");
    }
}
