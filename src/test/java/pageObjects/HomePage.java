package pageObjects;

/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;*/


/*public class HomePage extends BasePage
{
    WebDriverWait wait;
    public HomePage (WebDriver driver)
    {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//span[normalize-space()='Frontend']")
    WebElement Frontend;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement linkRegister;

   *//* public void clickReg()
    {
        linkRegister.click();
    }*//*

    public void clickReg() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(linkRegister));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", linkRegister);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", linkRegister);
    }
    public void clickFront()
    {
        Frontend.click();
    }
}*/
