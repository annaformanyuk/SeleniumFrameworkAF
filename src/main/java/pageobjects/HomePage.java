package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseMain{

    public HomePage(WebDriver driver){
        super(driver);
    }

    String logIn_Btn = "//a[@data='record-data' and @class='menu-item log-in-button']";
    String websiteURL = "https://test.my-fork.com/";

    public void clickLogIn(){
        driver.get(websiteURL);
        driver.findElement(By.xpath(logIn_Btn)).click();
    }

    public void openWebsite(){
        driver.get(websiteURL);
    }
}
