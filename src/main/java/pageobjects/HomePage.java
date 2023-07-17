package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseMain{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String logIn_Btn = "//a[@data='record-data' and @class='menu-item log-in-button']";
    String websiteURL = "https://test.my-fork.com/";
    String SignUp = "//div[@id='sign-up-button']";
    String JobTitleValues = "//select[@id='job-title']";

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




   // public void JobTitleDropdown(){
       // WebElement element = driver.findElement(By.xpath(JobTitleValues));
       // System.out.println(element);

   // }
}
