package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealPageTest extends TestBase {
    HotDealsPage hotDealsPage=new HotDealsPage();
    @Test
    public void verifySaleText(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnSaleLink();
        String expectedText="Sale";
        String actualText= hotDealsPage.getSaleText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
    @Test
    public void verifyBestsellersText(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnBestsellersLink();
        String expectedText="Bestsellers";
        String actualText= hotDealsPage.getBestsellersText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
    }
}
