package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageobjects.HomePage;
import pageobjects.SignInPage;

import java.time.Duration;
import java.util.List;

public class lesson2 extends BaseTest{

    String expectedMainTitle = "My Fork - your educational solution";
    String actualMainTitle;
    String MainCards = "//div[contains(@class,'home-middle-block-lectures-block-list-item lecture-card')]";
    int MainCardsListSizeActual;
    int MainCardsListSizeExpected = 5;

    //locators


    @Test
    public void websiteLogIn(){

        homePage.clickLogIn();

    }

    @Test
    public void emailPasswordSendKeys(){
        homePage.clickLogIn();
        signInPage.emailPassword();
    }

    @Test
    public void emailPasswordSendKeysEnter(){
        emailPasswordSendKeys();
        signInPage.enter();
    }

    @Test
    public void OpenWebsite(){
        homePage.openWebsite();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false, "Correct site");
        actualMainTitle = driver.getTitle();
        softAssert.assertEquals(actualMainTitle, expectedMainTitle);
        List<WebElement> MainList = driver.findElements(By.xpath(MainCards));
        MainCardsListSizeActual = MainList.size();
        softAssert.assertEquals(MainCardsListSizeActual, MainCardsListSizeExpected);
        softAssert.assertNull(expectedMainTitle,"List on Main Page");
       // softAssert.assertAll();
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