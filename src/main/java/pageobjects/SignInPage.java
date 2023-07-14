package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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

}
