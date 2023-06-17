package TestCasesAF;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCaseAF {

    @Test
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.nytimes.com/");

    }
}
