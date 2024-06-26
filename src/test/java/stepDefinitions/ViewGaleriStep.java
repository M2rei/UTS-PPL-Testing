package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AdminReadGaleriPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewGaleriStep {
    WebDriver driver;

    AdminReadGaleriPage adminReadGaleriPage;

    public ViewGaleriStep() {
        this.driver = Hooks.getDriver();
        this.adminReadGaleriPage = new AdminReadGaleriPage(driver);
    }
    @Given("a galleryy item {string} exists")
    public void a_gallery_item_exists(String itemName) {
        Hooks.viewgaleri.log(Status.INFO, "masuk ke halaman galeri");
        driver.get("http://127.0.0.1:8001/admingaleri");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sidebar")));
    }

    @When("the admin views the {string} data")
    public void the_admin_views_the_data(String categoryData) {
        Hooks.viewgaleri.log(Status.INFO, "data tampil");
        String actualCategoryData = adminReadGaleriPage.getCategoryData(categoryData);
        Assertions.assertNotNull(actualCategoryData);
    }


}
