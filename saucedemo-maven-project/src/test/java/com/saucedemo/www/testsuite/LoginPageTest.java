package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.pages.ProductPage;
import com.saucedemo.www.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginpage=new LoginPage();
    ProductPage productPage=new ProductPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        String expectedMessage="PRODUCTS";
        String actualMessage=loginpage.getProductMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"Products displayed");
    }

    @Test
    public void verifyThatSixProductAreDisplayedOnPage(){
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        //productPage.getproductList();
        int expectedResult=6;
        int actualResult=productPage.getproductList();
        Assert.assertEquals(expectedResult,actualResult,"product not Match");

    }




}
