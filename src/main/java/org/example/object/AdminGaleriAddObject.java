package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminGaleriAddObject {
    public WebDriver driver;

    public AdminGaleriAddObject(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getJudulInput() {
        return driver.findElement(By.id("judul"));
    }
    public WebElement getGambarInput(){
        return driver.findElement(By.id("gambar"));
    }
    public WebElement getKategoriInput(){
        return driver.findElement(By.id("kategori"));
    }
    public WebElement getSaveButton(){
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }

}
