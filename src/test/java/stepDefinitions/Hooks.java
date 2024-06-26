package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
    private static WebDriver driver;

    public static ExtentTest creategaleri;
    public static ExtentReports extent;
    public static ExtentTest updategaleri;
    public static ExtentTest viewgaleri;
    public static ExtentTest deletegaleri;
    public static ExtentTest downloadfile;

    @BeforeAll
    public static void setUp(){
        extent = ExtentReportManager.getInstance();
        if (driver == null){
            driver = new  ChromeDriver();
            driver.manage().window().maximize();

            creategaleri = extent.createTest("create");
            updategaleri = extent.createTest("Update");
            viewgaleri = extent.createTest("view");
            deletegaleri = extent.createTest("delete");
            downloadfile = extent.createTest("download file");
        }

    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        creategaleri.log(Status.INFO,"data berhasil di tambahkan");
        updategaleri.log(Status.INFO,"data berhadil di update");
        viewgaleri.log(Status.INFO, "Data berhasil di tampilakn");
        deletegaleri.log(Status.INFO, "data berhasil di hapus");
        downloadfile.log(Status.INFO, "berhasil download file");


        extent.flush();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
