package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Siya012");
        loginPage.enterPassword("spatel012");
        loginPage.clickOnLogInButton();
        String expectedText="Accounts Overview";
        String actualText=loginPage.getAccountOverviewText();
        Assert.assertEquals(expectedText,actualText,"Text not Match");
    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        loginPage.enterUserName("Siya12");
        loginPage.enterPassword("spatel2");
        loginPage.clickOnLogInButton();
        String expectedErrorMessage="The username and password could not be verified.";
        String actualErrorMessage=loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message not displayed");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.enterUserName("Siya012");
        loginPage.enterPassword("spatel012");
        loginPage.clickOnLogInButton();
        loginPage.clickOnLogOutButton();
        String expectedText="Customer Login";
        String actualText=loginPage.getCustomerLoginText();
       Assert.assertEquals(expectedText,actualText,"Customer text not displayed");
    }

}
