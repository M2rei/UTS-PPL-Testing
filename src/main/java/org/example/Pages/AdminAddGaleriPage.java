package org.example.Pages;

import org.example.object.AdminGaleriAddObject;
import org.openqa.selenium.WebDriver;

public class AdminAddGaleriPage {

    private WebDriver driver;
    private AdminGaleriAddObject adminGaleriAddObject;

    public AdminAddGaleriPage(WebDriver driver) {
        this.driver = driver;
        this.adminGaleriAddObject = new AdminGaleriAddObject(driver);
    }

    public void setJudul(String judul) {
        adminGaleriAddObject.getJudulInput().sendKeys(judul);
    }

    public void setGambar(String filePath) {
        adminGaleriAddObject.getGambarInput().sendKeys(filePath);
    }

    public void setKategori(String kategori) {
        adminGaleriAddObject.getKategoriInput().sendKeys(kategori);
    }

    public void clickSaveButton() {
        adminGaleriAddObject.getSaveButton().click();
    }

    public void fillForm(String judul, String filePath, String kategori) {
        setJudul(judul);
        setGambar(filePath);
        setKategori(kategori);
    }

    public void fillFormAndSubmit(String judul, String filePath, String kategori) {
        fillForm(judul, filePath, kategori);
        clickSaveButton();
    }
}
