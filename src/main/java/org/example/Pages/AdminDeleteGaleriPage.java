package org.example.Pages;

import org.example.object.AdminGaleriDeleteObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminDeleteGaleriPage {
    private WebDriver driver;
    private WebDriverWait wait;

    AdminGaleriDeleteObject adminGaleriDeleteObject;
    public AdminDeleteGaleriPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.adminGaleriDeleteObject = new AdminGaleriDeleteObject(driver);
    }

    public void clickhapusgaleriButton() {
        WebElement hapusgaleri = wait.until(ExpectedConditions.elementToBeClickable(adminGaleriDeleteObject.getdeletegaleriButton()));
        hapusgaleri.click();
    }
}
