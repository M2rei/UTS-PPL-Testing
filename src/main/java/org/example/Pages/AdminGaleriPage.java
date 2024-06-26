package org.example.Pages;

import org.example.object.AdminGaleriObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminGaleriPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private AdminGaleriObject galeriObject;

    public AdminGaleriPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        this.galeriObject = new AdminGaleriObject(driver);
    }

    public void navigateToGaleri(String galeriUrl) {
        driver.get(galeriUrl);
    }
    public void clickTambahFotoButton() {
        WebElement tambahFotoButton = wait.until(ExpectedConditions.elementToBeClickable(galeriObject.getTambahFotoButton()));
        tambahFotoButton.click();
    }
}
