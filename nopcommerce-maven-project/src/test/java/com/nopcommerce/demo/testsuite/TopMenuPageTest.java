package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        topMenuPage.clickOnComputerTab();
        String expectedText="Computers";
        String actualtext=topMenuPage.getComputerText();
        Assert.assertEquals(expectedText,actualtext,"Computer text not displayed");
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        topMenuPage.clickOnElectronicsTab();
        String expectedText="Electronics";
        String actualtext=topMenuPage.getElectronicsText();
        Assert.assertEquals(expectedText,actualtext,"Electronic text not displayed");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        topMenuPage.clickOnApparelTab();
        String expectedText="Apparel";
        String actualtext=topMenuPage.getApparelText();
        Assert.assertEquals(expectedText,actualtext,"Apparel text not displayed");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        topMenuPage.clickOnDigitalDownloadsTab();
        String expectedText="Digital downloads";
        String actualtext=topMenuPage.getDigitalDownloadsText();
        Assert.assertEquals(expectedText,actualtext,"DigitalDownloads text not displayed");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        topMenuPage.clickOnBooksTab();
        String expectedText="Books";
        String actualtext=topMenuPage.getBooksText();
        Assert.assertEquals(expectedText,actualtext,"Books text not displayed");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        topMenuPage.clickOnJewelryTab();
        String expectedText="Jewelry";
        String actualtext=topMenuPage.getJewelryText();
        Assert.assertEquals(expectedText,actualtext,"Jewelry text not displayed");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        topMenuPage.clickOnGiftCardsTab();
        String expectedText="Gift Cards";
        String actualtext=topMenuPage.getGiftCardsText();
        Assert.assertEquals(expectedText,actualtext,"Giftcards text not displayed");
    }

}
