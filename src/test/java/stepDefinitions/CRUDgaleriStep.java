package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AdminAddGaleriPage;
import org.example.Pages.AdminGaleriPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CRUDgaleriStep {
    WebDriver driver;
    AdminGaleriPage adminGaleriPage;
    AdminAddGaleriPage adminAddGaleriPage;

    public CRUDgaleriStep() {
        this.driver = Hooks.getDriver();
        this.adminGaleriPage = new AdminGaleriPage(driver);
        this.adminAddGaleriPage = new AdminAddGaleriPage(driver);
    }

    @Given("the admin navigates to the gallery page")
    public void the_admin_navigates_to_the_gallery_page() {
        Hooks.creategaleri.log(Status.INFO, "masuk ke halaman galeri");
        adminGaleriPage.navigateToGaleri("http://127.0.0.1:8001/admingaleri");
    }

    @When("the admin clicks on Add New Photo")
    public void the_admin_clicks_on_add_new_photo() {
        Hooks.creategaleri.log(Status.INFO, "admin mengklik tombol tambah galeri");
        adminGaleriPage.clickTambahFotoButton();
    }

    @When("the admin uploads a photo {string}")
    public void the_admin_uploads_a_photo(String filePath) {
        Hooks.creategaleri.log(Status.INFO, "admin menambahakan meng upload gambar");
        adminAddGaleriPage.setGambar(filePath);
    }

    @When("the admin enters the title {string}")
    public void admin_enters_the_title(String title) {
        Hooks.creategaleri.log(Status.INFO, "admin menginputkan judul");
        adminAddGaleriPage.setJudul(title);
    }

    @When("the admin selects the category {string}")
    public void the_admin_selects_the_category(String category) {
        Hooks.creategaleri.log(Status.INFO, "memilih kategori galeri");
        adminAddGaleriPage.setKategori(category);
    }

    @When("the admin clicks on Save")
    public void the_admin_clicks_on_save() {
        Hooks.creategaleri.log(Status.INFO, "admin megn klik tombol save");
        adminAddGaleriPage.clickSaveButton();
    }

    @Then("the new gallery item {string} should be displayed in the gallery list")
    public void the_new_gallery_item_should_be_displayed_in_the_gallery_list(String title) {
        Hooks.creategaleri.log(Status.INFO, "data baru tampil di tampilan");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement newGalleryItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + title + "')]")));
        assertTrue(newGalleryItem.isDisplayed());
    }

}
