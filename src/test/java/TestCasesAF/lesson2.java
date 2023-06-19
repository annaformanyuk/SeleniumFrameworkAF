package TestCasesAF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class lesson2 {
    @Test
    public void OpenWebsite(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");

    }

   @Test
    public void OpenSignInPage(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
    }


@Test
    public void ValidateEmailPasswordAndLoginOnSignInPage(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@id='password']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed());

    }

@Test
    public void EnterInvalidEmailAndPasswordOnSignInPage(){
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.om");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

    }

    @Test
    public void ValidateErrorIsAppearedOnSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.om");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[text()='Error: email is incorrect']")).isDisplayed());

    }

    @Test
    public void ValidateErrorMessageTextOnSignInPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("email@gmail.om");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//p[text()='Error: email is incorrect']")).getText());

    }


    @Test
    public void ValidateRememberMeCheckboxIsChecked() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/aformanjuk/IdeaProjects/SeleniumProjectAnnaF/src/test/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://test.my-fork.com/");
        driver.findElement(By.xpath("//a[@data='record-data' and @class='menu-item log-in-button']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//input[@id='auth-page-remember-me']")).isSelected());
    }}



