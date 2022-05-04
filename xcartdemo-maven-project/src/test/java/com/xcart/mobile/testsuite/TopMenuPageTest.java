package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.TopMenuPage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        topMenuPage.clickOnShippingTab();
        String expectedText="Shipping";
        String actualText= topMenuPage.getShippingText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        topMenuPage.clickOnNewTab();
        String expectedText="New arrivals";
        String actualText= topMenuPage.getNewArrivalText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        topMenuPage.clickOnComingSoonTab();
        String expectedText="Coming soon";
        String actualText= topMenuPage.getComingSoonText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        topMenuPage.clickOnContactUsTab();
        String expectedText="Contact us";
        String actualText= topMenuPage.getContactUsText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }

}
