package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

public class lesson2 extends BaseTest{

    //locators



    public void websiteLogIn(){

        homePage.clickLogIn();
    }

    public void emailPasswordSendKeys(){
        signInPage.emailPassword();
    }

    public void emailPasswordSendKeysEnter(){
        emailPasswordSendKeys();
        signInPage.enter();
    }

    @Test
    public void OpenWebsite(){

        homePage.openWebsite();
    }

   @Test
    public void OpenSignInPage(){

       websiteLogIn();
    }

@Test
    public void ValidateEmailPasswordAndLoginOnSignInPage(){

        websiteLogIn();
        signInPage.emailPasswordDisplayed();
    }

@Test
    public void EnterInvalidEmailAndPasswordOnSignInPage(){

        websiteLogIn();
        emailPasswordSendKeys();
        signInPage.submit();
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
}