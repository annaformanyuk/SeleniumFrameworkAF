package pageobjects;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;

public class BaseMain {

    int tabHandler;
    public WebDriver driver;
    int pixels = 1000;

    public BaseMain (WebDriver driver){
        this.driver = driver;
    }

    public void windowHandler(){
        driver.switchTo().newWindow(WindowType.TAB);
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabHandler.size());
        for(int tab = 0; tab < tabHandler.size(); tab++){
            System.out.println(driver.switchTo().window(tabHandler.get(tab)));
        }
    }

    public void scrollingPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+pixels+")", "");
    }

}
