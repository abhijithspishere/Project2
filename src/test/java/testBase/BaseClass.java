package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass
{
    public WebDriver driver;

    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load the test environment URL where CAPTCHA is disabled
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        // In a real test environment, the URL should point to a staging environment
        // where CAPTCHA is disabled. Request developers to disable CAPTCHA on staging.
    }

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

    public String randomString()
    {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }

    public String randomNumerals()
    {
        String generatedNum = RandomStringUtils.randomNumeric(10);
        return generatedNum;
    }

    public String alphanumerals()
    {
        String str = RandomStringUtils.randomAlphabetic(3);
        String num = RandomStringUtils.randomNumeric(3);
        return (str+"@"+num);
    }
}
