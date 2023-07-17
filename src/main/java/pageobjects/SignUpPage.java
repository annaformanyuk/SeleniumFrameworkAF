package pageobjects;

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

    public void JobTitleDropdown() {
        WebElement jobtitleelement;
        jobtitleelement = driver.findElement(By.xpath(JobTitleValues));
        Select dropdown = new Select(jobtitleelement);
        List<WebElement> JobList = new ArrayList<>();
        JobList = dropdown.getOptions();
        for (int i = 0; i < JobList.size(); i++) {
            System.out.println(JobList.get(i).getText());
    }

}}
//if (JobList.get(i).getText().equals(expected)){
  //      System.out.println("Job Title dropdown has currently supported roles from the list");}
