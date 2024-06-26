package org.example.Pages;

import org.example.object.AdminGaleriObject;
import org.example.object.PublicKurikulumObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PublicKurikulumPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private PublicKurikulumObject publicKurikulumObject;

    public PublicKurikulumPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.publicKurikulumObject = new PublicKurikulumObject(driver);
    }

    public void navigateToKurikulum(String kurikulumUrl) {
        driver.get(kurikulumUrl);
    }
    public void clickUnduhButton() {
        WebElement unduhfile = wait.until(ExpectedConditions.elementToBeClickable(publicKurikulumObject.Unduhfile()));
        unduhfile.click();
    }
}
