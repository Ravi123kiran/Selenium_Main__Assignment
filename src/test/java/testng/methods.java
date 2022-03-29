package testng;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.IOException;

public class methods {
    public static WebDriver d;
    @BeforeTest
    public static WebDriver initial_set() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravikumaa\\Downloads\\chromedriver.exe");
        d = new ChromeDriver();
        d.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        d.manage().window().maximize();
        return d;
    }
    @AfterTest
    public void CloseBrowser(){
        d.quit();
    }
}
