package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseMain{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String logIn_Btn = "//a[@data='record-data' and @class='menu-item log-in-button']";
    String websiteURL = "https://test.my-fork.com/";
    String SignUp = "//div[@id='sign-up-button']";
//    String JobTitleValues = "//select[@id='job-title']";
    String RememberMe = "//input[@id='auth-page-remember-me']";

    public void clickLogIn(){
        driver.get(websiteURL);
        driver.findElement(By.xpath(logIn_Btn)).click();
    }

    public void openWebsite(){
        driver.get(websiteURL);
    }

    public void clickSignUp(){
        driver.get(websiteURL);
        driver.findElement(By.xpath(SignUp)).click();
    }

    public void RememberMeCheckBox(){
        System.out.println(driver.findElement(By.xpath(RememberMe)).isSelected());
    }

//    public void WaitCheckBox(){
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RememberMe)));
//    }

}
