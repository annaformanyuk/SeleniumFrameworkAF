package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.time.Duration;

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
    public void ValidateErrorIsAppearedOnSignInPage(){

        websiteLogIn();
        emailPasswordSendKeysEnter();
//        Thread.sleep(5000);
        signInPage.WaitError();
        signInPage.errorValidate();
    }

    @Test
    public void ValidateErrorMessageTextOnSignInPage(){

        websiteLogIn();
        emailPasswordSendKeysEnter();
        signInPage.WaitError();
        signInPage.errorValidateText();
    }

    @Test
    public void ValidateRememberMeCheckboxIsChecked(){

        websiteLogIn();
        homePage.RememberMeCheckBox();
    }


}