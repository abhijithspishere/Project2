package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
/*import pageObjects.HomePage;*/
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass {

    @Test
    public void verifyAc_Reg() throws InterruptedException {
      /*  HomePage hp = new HomePage(driver);
        hp.clickFront();
        hp.clickReg();*/

        AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

        regpage.setGender();
        regpage.setFirstName(randomString());
        regpage.setLastName(randomString());
        regpage.slctDay("10");
        regpage.slctMonth("July");
        regpage.slctYear("2023");
        regpage.setEmail(randomString()+"@"+"gmail.com");

        String samePwd = alphanumerals();
        regpage.setPassword(samePwd);
        regpage.setConfirmpassword(samePwd);

        regpage.clickRegister();

        String generatedMessage = regpage.get_confirmMessage();
        Assert.assertEquals(generatedMessage,"Your registration completed");

        regpage.clickContinue();
    }


}
