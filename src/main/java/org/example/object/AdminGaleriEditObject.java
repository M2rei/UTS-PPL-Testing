package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminGaleriEditObject {
    public WebDriver driver;

    public AdminGaleriEditObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getEditButton() {
        return (By.id("button-clikeditgaleri"));
    }

    public WebElement editjudul() {
        return driver.findElement(By.id("judul"));
    }

    public WebElement editKategoriInput(){
        return driver.findElement(By.id("kategori"));
    }
    public WebElement getSaveButton(){
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public String getGalleryItemCategory() {
        return "Prestasi";
    }

}