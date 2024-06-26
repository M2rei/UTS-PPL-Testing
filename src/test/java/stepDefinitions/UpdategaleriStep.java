package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AdminAddGaleriPage;
import org.example.Pages.AdminEditGaleriPage;
import org.example.Pages.AdminGaleriPage;
import org.example.object.AdminGaleriEditObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpdategaleriStep {
    WebDriver driver;

    private AdminEditGaleriPage adminEditGaleriPage;
    private AdminGaleriEditObject adminGaleriEditObject;

    public UpdategaleriStep() {
        this.driver = Hooks.getDriver();
        this.adminEditGaleriPage = new AdminEditGaleriPage(driver);
        this.adminGaleriEditObject = new AdminGaleriEditObject(driver);
    }
    @Given("a gallery item {string} exists")
    public void a_gallery_item_exists(String itemName) {
        Hooks.updategaleri.log(Status.INFO, "admin membuka galeri");
        driver.get("http://127.0.0.1:8001/admingaleri");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(), '" + itemName + "')]")));
    }

    @When("the admin clicks on \"Edit\" for {string}")
    public void the_admin_clicks_on_edit_for(String itemName) {
        Hooks.updategaleri.log(Status.INFO, "Admin meng klik tombol edit");
        adminEditGaleriPage.clickEditButton(itemName);
    }


    @When("the admin updates the title to {string}")
    public void the_admin_updates_the_title_to(String title) {
        Hooks.updategaleri.log(Status.INFO, "melakukan update judul ");
        adminEditGaleriPage.setJudul(title);
    }

    @When("the admin updates the category to {string}")
    public void the_admin_updates_the_category_to(String newCategory) {
        Hooks.updategaleri.log(Status.INFO, "melakukan update kategori ");
        adminEditGaleriPage.setKategori(newCategory);
    }

    @When("the admin clicks on \"Save\"")
    public void the_admin_clicks_on_save() {
        Hooks.updategaleri.log(Status.INFO, "admin mengklik tombol save");
        adminEditGaleriPage.clickSaveButton();
    }

    @Then("the category should be {string}")
    public void the_category_should_be(String expectedCategory) {
        Hooks.updategaleri.log(Status.INFO, "update data galeri sudah berhasil");
        String actualCategory = adminGaleriEditObject.getGalleryItemCategory();
        assertEquals(expectedCategory, actualCategory);
    }

}
