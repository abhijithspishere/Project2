package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage
{
public AccountRegistrationPage (WebDriver driver)
{
    super(driver);
}

@FindBy(xpath ="//input[@id='gender-male']")
    WebElement chkboxMale;

@FindBy(xpath="//input[@id='FirstName']")
    WebElement txtFirstName;

@FindBy(xpath="//input[@id='LastName']")
    WebElement txtLastName;

@FindBy(xpath="//select[@name='DateOfBirthDay']")
    WebElement drpDay;

@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement drpMonth;

@FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement drpYear;

@FindBy(xpath = "//input[@id='Email']")
    WebElement txtEmail;

@FindBy(xpath = "//input[@id='Company']")
    WebElement txtCompany;

@FindBy(xpath = "//input[@id='Password']")
    WebElement txtPassword;

@FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement txtConfirmPassword;

@FindBy(xpath = "//button[@id='register-button']")
    WebElement btnRegister;

@FindBy(xpath = "//div[@class='result']")
    WebElement confrmMessage;

@FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement btnContinue;

public void  setGender()
{
   chkboxMale.click();
}

public void setFirstName(String fname)
{
    txtFirstName.sendKeys(fname);
}

public void setLastName (String lname)
{
    txtLastName.sendKeys(lname);
}

public void slctDay(String day)
{
    Select selectDay = new Select(drpDay);
    selectDay.selectByVisibleText(day);
}

public void slctMonth (String month)
{
    Select selectMonth = new Select(drpMonth);
    selectMonth.selectByVisibleText(month);
}

public void slctYear (String year)
{
    Select selectYear = new Select(drpYear);
    selectYear.selectByVisibleText(year);
}

public void setEmail(String email)
{
    txtEmail.sendKeys(email);
}

public void setPassword(String password)
{
    txtPassword.sendKeys(password);
}

public void setConfirmpassword(String password)
{
    txtConfirmPassword.sendKeys(password);
}

public void clickRegister()
{
    btnRegister.click();
}

public  String get_confirmMessage ()
{
    try
    {
        return (confrmMessage.getText());
    }
    catch (Exception e)
    {
        return (e.getMessage());
    }
}

public void clickContinue()
{
    btnContinue.click();
}
}
