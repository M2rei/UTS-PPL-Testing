package org.example.Pages;


import org.example.object.AdminGaleriEditObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminEditGaleriPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private AdminGaleriEditObject adminGaleriEditObject;

    public AdminEditGaleriPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.adminGaleriEditObject = new AdminGaleriEditObject(driver);
    }

    public void clickEditButton(String galleryItem) {
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(adminGaleriEditObject.getEditButton()));
        editButton.click();
    }

    public void setJudul(String judul) {
        WebElement judulElement = wait.until(ExpectedConditions.visibilityOf(adminGaleriEditObject.editjudul()));
        judulElement.sendKeys(judul);
    }

    public void setKategori(String kategori) {
        WebElement kategoriElement = wait.until(ExpectedConditions.visibilityOf(adminGaleriEditObject.editKategoriInput()));
        kategoriElement.sendKeys(kategori);
    }

    public void clickSaveButton() {
        adminGaleriEditObject.getSaveButton().click();
    }
}
