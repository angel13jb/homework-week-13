package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    RegisterPage registerPage=new RegisterPage();
    HomePage homePage=new HomePage();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String expectedText="Register";
        String actualText= homePage.getRegisterText();
        Assert.assertEquals(expectedText,actualText,"Text not match");

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadioButton();
        registerPage.enterFirstName("sweety");
        registerPage.enterLastName("patel");
        registerPage.selectbirthDay("1");
        registerPage.selectbirthMonth("March");
        registerPage.selectbirthYear("1981");
        registerPage.enterEmail("sweetypatel@gmail.com");
        registerPage.enterPassword("sweety123");
        registerPage.enterConfirmPassword("sweety123");
        registerPage.clickOnRegisterButton();
        String expectedMessage="Your registration completed";
        String actualMessage= registerPage.getRegistrationConfirmText();
        Assert.assertEquals(expectedMessage,actualMessage,"Message not match");



    }










}
