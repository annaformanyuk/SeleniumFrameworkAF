package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.SignInPage;

import java.util.ArrayList;
import java.util.List;

public class lesson5part1Test extends BaseTest{
    String expectedTitle = "Sign Up";
    String actualTitle;
    int jobListSizeExpected = 14;
    int jobListSizeActual;
    boolean driverJob;
    String JobTitleValues = "//select[@id='job-title']";

    @Test
    public void JobTitleValuesOnSignIn(){
        homePage.clickSignUp();
        signUpPage.JobTitleDropdown();

        driver.get("https://test.my-fork.com/register");
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        WebElement jobtitleelement;
        jobtitleelement = driver.findElement(By.xpath(JobTitleValues));
        Select dropdown = new Select(jobtitleelement);
        List <WebElement> JobList = new ArrayList<>();
        JobList = dropdown.getOptions();
        jobListSizeActual = JobList.size();
        Assert.assertEquals(jobListSizeActual,jobListSizeExpected);
        Assert.assertTrue(true,"Should be size 14");
        Assert.assertNotEquals(jobListSizeActual,jobListSizeExpected);    //fail //(jobListSizeActual,jobListSizeExpected);

    }

}


//    HARD
//    Add at least 4 different hard asserts using int, String, and Boolean.
//    For this, use the webpage's title, headers, lists, and any other
//    web elements you can think of. Make sure that the first 3 hard asserts
//    are passed and the last one fails, so it will not fail earlier than 4th assert.