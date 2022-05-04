package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homepage=new HomePage();
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homepage.clickOnSigninLink();
        String expectedMessage="Welcome Back!";
        String actualMessage=homepage.getWelcomeText();
        Assert.assertEquals(expectedMessage,actualMessage,"Welcome Back!");
    }
    @Test
    public void verifyTheErrorMessageWithInvalidCredentials(){
        homepage.clickOnSigninLink();
        loginPage.enterEmailId("prime@gmail.com");
        loginPage.enterPassWord("prime1");
        loginPage.clickOnSignInButton();
        String expectedErrorMessage="Invalid email or password.";
        String actualErrorMessage= loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage,"Error message displayed");

    }
}
