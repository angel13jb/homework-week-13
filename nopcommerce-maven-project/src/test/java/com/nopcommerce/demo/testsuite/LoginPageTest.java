package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homepage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage= loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }
    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("sweetypatel@gmail.com");
        loginPage.enterPassword("sweety123");
        loginPage.clickOnLoginButtton();
        String expectedText="Log out";
        String actualText=loginPage.getLogOutText();
        Assert.assertEquals(expectedText,actualText,"Log out Text not displayed");




    }
    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButtton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage= loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");



    }
}
