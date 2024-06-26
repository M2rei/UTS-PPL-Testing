package org.example.Pages;

import org.example.object.AdminGaleriObject;
import org.example.object.AdminGaleriReadObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminReadGaleriPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private AdminGaleriReadObject adminGaleriReadObject;

    public AdminReadGaleriPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.adminGaleriReadObject = new AdminGaleriReadObject(driver);
    }
    public String getCategoryData(String categoryData) {
        return driver.findElement(adminGaleriReadObject.getCategoryDataLocator(categoryData)).getText();
    }


}
