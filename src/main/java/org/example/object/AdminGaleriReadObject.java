package org.example.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminGaleriReadObject {
    public WebDriver driver;
    public AdminGaleriReadObject(WebDriver driver){
        this.driver = driver;
    }
    public By getGalleryItemTitleLocator(String itemName) {
        return By.xpath("//*[contains(text(), '" + itemName + "')]");
    }

    public By getCategoryDataLocator(String categoryData) {
        return By.xpath("//*[contains(text(), '" + categoryData + "')]");
    }
}
