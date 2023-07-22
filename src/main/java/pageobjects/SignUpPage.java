package pageobjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SignUpPage extends BaseMain {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    String JobTitleValues = "//select[@id='job-title']";
    //String[] expected = {"Junior level Developer", "Middle level Developer", "Senior level Developer", "Leading Developer", "QA Analyst", "Software Tester", "QA Engineer", "Senior QA Engineer", "Automation QA Engineer", "Test Lead", "Automation Test Lead", "Business Analyst", "Senior Business Analyst", "Designer"};
    String expectedTitle = "Sign Up";
    String actualTitle;
    int jobListSizeExpected = 14;
    int jobListSizeActual;
    boolean driverJob;
    String url = "https://test.my-fork.com/register";
    public void JobTitleDropdown() {
        WebElement jobtitleelement;
        jobtitleelement = driver.findElement(By.xpath(JobTitleValues));
        Select dropdown = new Select(jobtitleelement);
        List<WebElement> JobList = new ArrayList<>();
        JobList = dropdown.getOptions();
        for (int i = 0; i < JobList.size(); i++) {
            System.out.println(JobList.get(i).getText());
    }



    }
}
//if (JobList.get(i).getText().equals(expected)){
  //      System.out.println("Job Title dropdown has currently supported roles from the list");}

// HARD
//    Add at least 4 different hard asserts using int, String, and Boolean.
//    For this, use the webpage's title, headers, lists, and any other
//    web elements you can think of. Make sure that the first 3 hard asserts
//    are passed and the last one fails, so it will not fail earlier than 4th assert.