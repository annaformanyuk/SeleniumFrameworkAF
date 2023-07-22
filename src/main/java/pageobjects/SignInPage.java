package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends BaseMain{

    public SignInPage(WebDriver driver){
        super(driver);
    }

    String email_Btn = "//input[@id='email']";
    String password_Btn = "//input[@id='password']";
    String submit_Btn = "//button[@type='submit']";
    //parameters
    String emailValue = "email@gmail.om";
    String passwordValue = "password";
    String error = "//p[text()='Error: email is incorrect']";


    public void emailPassword() {

        driver.findElement(By.xpath(email_Btn)).sendKeys(emailValue);
        driver.findElement(By.xpath(password_Btn)).sendKeys(passwordValue);
    }

    public void enter(){
        driver.findElement(By.xpath(password_Btn)).sendKeys(Keys.ENTER);
    }

    public void emailPasswordDisplayed(){
        System.out.println(driver.findElement(By.xpath(email_Btn)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(password_Btn)).isDisplayed());
        System.out.println(driver.findElement(By.xpath(submit_Btn)).isDisplayed());
    }

    public void submit(){
        driver.findElement(By.xpath(submit_Btn)).submit();
    }

    public void errorValidate(){
        System.out.println(driver.findElement(By.xpath(error)).isDisplayed());
    }

    public void errorValidateText(){
        System.out.println(driver.findElement(By.xpath(error)).getText());
    }

    public void WaitError(){
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(error)));
    }




}
