package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminGaleriObject {
    public WebDriver driver;

    public AdminGaleriObject(WebDriver driver){
        this.driver = driver;
    }
    public By getTestAdminGaleri(){
        return By.xpath("//*[contains(text(), 'Setting Galeri'");
    }
    public By getTambahFotoButton() {
        return By.id("button-clikgaleri");
    }
}
