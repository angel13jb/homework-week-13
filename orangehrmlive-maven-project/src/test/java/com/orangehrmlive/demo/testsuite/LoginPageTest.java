package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordLinkPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    ForgotPasswordLinkPage forgotPasswordLinkPage=new ForgotPasswordLinkPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage="Welcome";
        String actualMessage=loginPage.getWelcomeText().substring(0,7);
        Assert.assertEquals(expectedMessage,actualMessage,"Welcome message not displayed");

    }
    @Test
    public void userShouldNavigateTOForgotPasswordPageSuccessfully(){
        forgotPasswordLinkPage.clickOnForgotYourPassword();
        String expectedMessage="Forgot Your Password?";
        String actualMessage=forgotPasswordLinkPage.getForgotPasswordText();
        Assert.assertEquals(expectedMessage,actualMessage,"Forgot Password text not displayed");
    }
}
