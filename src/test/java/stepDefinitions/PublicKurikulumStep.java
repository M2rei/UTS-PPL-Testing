package stepDefinitions;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.Pages.PublicKurikulumPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.Hooks;

import java.time.Duration;

public class PublicKurikulumStep {
    private WebDriver driver;
    private PublicKurikulumPage publicKurikulumPage;

    public PublicKurikulumStep() {
        this.driver = Hooks.getDriver();
        this.publicKurikulumPage = new PublicKurikulumPage(driver);
    }

    @Given("the user is on the curiculum page public")
    public void  the_user_is_on_the_curriculum_page(){
        Hooks.downloadfile.log(Status.INFO, "masuk ke halaman kurikulum");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        publicKurikulumPage.navigateToKurikulum("http://127.0.0.1:8001/akademik/kurikulum");
    }

    @When("the user clicks the download button public")
    public  void the_user_clicks_the_download_button(){
        Hooks.downloadfile.log(Status.INFO, "user klik download file");
        publicKurikulumPage.clickUnduhButton();
    }
}