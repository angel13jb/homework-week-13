package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassWord("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        String actualText = loginPage.getSecureAreaText();
        Assert.assertEquals(expectedText, actualText, "Secure area text not match");
    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassWord("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Your username is invalid!";
        String actualErrorMessage = loginPage.getUserNameInvalidText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Text not displayed");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassWord("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Your password is invalid!";
        String actualErrorMessage = loginPage.getUserNameInvalidText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Text not displayed");

    }
}