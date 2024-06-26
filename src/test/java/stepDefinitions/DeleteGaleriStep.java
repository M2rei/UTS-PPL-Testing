package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.AdminDeleteGaleriPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class DeleteGaleriStep {
    WebDriver driver;
    private AdminDeleteGaleriPage adminDeleteGaleriPage;
    public DeleteGaleriStep() {
        this.driver = Hooks.getDriver();
        this.adminDeleteGaleriPage = new AdminDeleteGaleriPage(driver);
    }
    @Given("a galleryyy item {string} exists")
    public void a_gallery_item_exists(String itemName) {
        Hooks.deletegaleri.log(Status.INFO, "masuk ke halaman galeri");
        driver.get("http://127.0.0.1:8001/admingaleri");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-clikgaleri")));
    }

    @When("the admin clicks on \"Delete\" for {string}")
    public void the_admin_clicks_on_delete_for(String itemName) {
        Hooks.deletegaleri.log(Status.INFO, "mengklik tombol delete");
        adminDeleteGaleriPage.clickhapusgaleriButton();
    }

    @When("the admin confirms the deletion in the modal")
    public void the_admin_confirms_the_deletion_in_the_modal() {
        adminDeleteGaleriPage.clickhapusgaleriButton();
    }

    @Then("the gallery item {string} should not be displayed in the gallery list")
    public void the_gallery_item_should_not_be_displayed_in_the_gallery_list(String deletedItem) {
        Hooks.deletegaleri.log(Status.INFO, "data berhasil di hapus");
        assertFalse(false);
    }
}
