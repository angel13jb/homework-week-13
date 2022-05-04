package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void verifyThatSigingUpPageDisplay(){
        registerPage.clickOnRegisterLink();
        String expectedText="Signing up is easy!";
        String actualText=registerPage.getSigningUpText();
        Assert.assertEquals(expectedText,actualText,"Sigingup page not displayed");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
       registerPage.clickOnRegisterLink();
       registerPage.enterFirstName("Siya");
       registerPage.enterLastName("Patel");
       registerPage.enterAddress("Abbey Lane");
       registerPage.enterCity("London");
       registerPage.enterState("UK");
       registerPage.enterZipCode("390002");
       registerPage.enterPhoneNumber("07764351845");
       registerPage.enterSSN("345-45-6575");
       registerPage.enterUserName("Siya012");
       registerPage.enterPassword("spatel012");
       registerPage.enterConfirmPassword("spatel012");
       registerPage.clickOnRegisterButton();
       String expectedMessage="Your account was created successfully. You are now logged in.";
       String actualMessage= registerPage.getLoggedInText();
       Assert.assertEquals(expectedMessage,actualMessage,"Logged In message not displayed");

    }
}
