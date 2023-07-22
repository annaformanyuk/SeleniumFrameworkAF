package TestCasesAF;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.HomePage;
import pageobjects.SignInPage;
import pageobjects.SignUpPage;

import java.time.Duration;

public class BaseTest {

    public ChromeDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        signUpPage = new SignUpPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void CloseBrowserPage(){
        driver.close();
    }
}
