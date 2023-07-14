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
    String logIn_Btn = "//a[@data='record-data' and @class='menu-item log-in-button']";
    String email_Btn = "//input[@id='email']";
    String password_Btn = "//input[@id='password']";
    String submit_Btn = "//button[@type='submit']";
    String websiteURL = "https://test.my-fork.com/";
    String error_txt = "//p[text()='Error: email is incorrect']";

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    public void websiteLogIn(){
        driver.get(websiteURL);
        driver.findElement(By.xpath(logIn_Btn)).click();
    }

    public void emailPasswordSendKeys(){
        driver.findElement(By.xpath(email_Btn)).sendKeys("email@gmail.om");
        driver.findElement(By.xpath(password_Btn)).sendKeys("password");
    }

    public void emailPasswordSendKeysEnter(){
        driver.findElement(By.xpath(email_Btn)).sendKeys("email@gmail.om");
        driver.findElement(By.xpath(password_Btn)).sendKeys("password");
        driver.findElement(By.xpath(password_Btn)).sendKeys(Keys.ENTER);
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
        System.out.println(driver.findElement(By.xpath(email_Btn)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(password_Btn)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(submit_Btn)).isDisplayed());
    }

@Test
    public void EnterInvalidEmailAndPasswordOnSignInPage(){

        websiteLogIn();
        emailPasswordSendKeys();
        driver.findElement(By.xpath(submit_Btn)).submit();
    }

    @Test
    public void ValidateErrorIsAppearedOnSignInPage() throws InterruptedException {

        websiteLogIn();
        emailPasswordSendKeysEnter();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath(error_txt)).isDisplayed());
    }

    @Test
    public void ValidateErrorMessageTextOnSignInPage() throws InterruptedException {

        websiteLogIn();
        emailPasswordSendKeysEnter();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath(error_txt)).getText());
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