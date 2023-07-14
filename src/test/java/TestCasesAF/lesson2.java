package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lesson2 {

    public ChromeDriver driver;
    public Locators locators = new Locators();
    String websiteURL = "https://test.my-fork.com/";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    public void websiteLogIn(){
        driver.get(websiteURL);
        driver.findElement(locators.logIn_Btn).click();
    }

    public void emailPasswordSendKeys(){
        driver.findElement(locators.email_Btn).sendKeys("email@gmail.om");
        driver.findElement(locators.password_Btn).sendKeys("password");
    }

    public void emailPasswordSendKeysEnter(){
        driver.findElement(locators.email_Btn).sendKeys("email@gmail.om");
        driver.findElement(locators.password_Btn).sendKeys("password");
        driver.findElement(locators.password_Btn).sendKeys(Keys.ENTER);
    }

    @Test
    public void OpenWebsite(){

        driver.get(websiteURL);
    }

   @Test
    public void OpenSignInPage(){

       websiteLogIn();
    }

@Test
    public void ValidateEmailPasswordAndLoginOnSignInPage(){

        websiteLogIn();
        System.out.println(driver.findElement(locators.email_Btn).isDisplayed());
        System.out.println(driver.findElement(locators.password_Btn).isDisplayed());
        System.out.println(driver.findElement(locators.submit_Btn).isDisplayed());
    }

@Test
    public void EnterInvalidEmailAndPasswordOnSignInPage(){

        websiteLogIn();
        emailPasswordSendKeys();
        driver.findElement(locators.submit_Btn).submit();
    }

    @Test
    public void ValidateErrorIsAppearedOnSignInPage() throws InterruptedException {

        websiteLogIn();
        emailPasswordSendKeysEnter();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[text()='Error: email is incorrect']")).isDisplayed());
    }

    @Test
    public void ValidateErrorMessageTextOnSignInPage() throws InterruptedException {

        websiteLogIn();
        emailPasswordSendKeysEnter();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[text()='Error: email is incorrect']")).getText());
    }

    @Test
    public void ValidateRememberMeCheckboxIsChecked() throws InterruptedException {

        websiteLogIn();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
    }

    @AfterMethod
    public void CloseBrowserPage(){
        driver.quit();
    }
}