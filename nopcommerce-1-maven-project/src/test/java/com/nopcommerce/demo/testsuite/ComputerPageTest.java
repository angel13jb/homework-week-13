package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    ComputerPage computerPage=new ComputerPage();
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        topMenuPage.mouseHoverOnComputer();
        topMenuPage.clickOnDesktop();

        computerPage.mouseHoverToBuildComputerImage();
        computerPage.clickOnAddCart();
        String expactedText = "Build your own computer";
        String actualText = computerPage.getTextFromBuildMyOwnNameField();
        Assert.assertEquals(actualText, expactedText, "verify text");
        computerPage.selectProcesser("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
        computerPage.selectRam("8GB [+$60.00]");
        computerPage.clickOnHddRadioButton();
        computerPage.clickOsRadioButton();
        computerPage.ClickOnTotalCommander();
        Thread.sleep(2000);
        String expactedPrice = "$1,480.00";
        String actualPrice = computerPage.getTextFromPriceFiled();
        Assert.assertEquals(actualPrice, expactedPrice, "verify text");
        computerPage.clickOnAddCartButton();
        String expactedmessage = "The product has been added to your shopping cart";
        String actualMessage = computerPage.gettextFromProductAddedField();
        Assert.assertEquals(actualMessage, expactedmessage, "verify Text");
        computerPage.clickOnCloseButton();
        computerPage.mouseHoverOnShoppingCart();
        computerPage.clickOnGoCart();
        Thread.sleep(2000);
        String expactedtext1 = "Shopping cart";
        String actualText1 = computerPage.gettextFromShoppingCartFeild();
        Assert.assertEquals(actualText1, expactedtext1, "verify text");
        Thread.sleep(5000);
        WebElement quantity = driver.findElement(By.xpath("//td[@class=\"quantity\"]/child::input"));
        quantity.clear();
        quantity.sendKeys("2");
        computerPage.clickOnUpdateCartButton();
        String expactedTotal = "$2,960.00";
        String actualTotal = computerPage.gettextfromTotalPriceField();
        Assert.assertEquals(actualTotal, expactedTotal, "verify total");
        computerPage.clickOnCheckBox();
        computerPage.clickOnCheckOut();
        String expactedWMessage = "Welcome, Please Sign In!";
        String actualWMessage = computerPage.getTextFromWelcomeField();
        Assert.assertEquals(actualWMessage, expactedWMessage, "verify text ");
        computerPage.clickOnRegisterAsGuest();
        // Fill the all mandatory field
        computerPage.enterfirstName("boby");
        computerPage.enterLastName("patel");
        computerPage.enterEmail("boby@gmail.com");
        computerPage.selectCountry("India");
        computerPage.selectState("Alabama");
        computerPage.enterCity("gujrat");
        computerPage.enterAddress("16 albany");
        computerPage.enterCode("2345");
        computerPage.enterPhonnumber("4564784356");
        Thread.sleep(2000);
        computerPage.clickOnContinue();
        //paymnet info
        computerPage.selectCardType("MasterCard");
        computerPage.enterName("jalpa");
        computerPage.enterCardNumber("555555576879556");
        computerPage.selectenterExpiryMonth("10");
        computerPage.selectenterExpiryYear("2067");
        computerPage.enterCode1("678");
        computerPage.clickOnContinueButton1();
        computerPage.clickOnConfirm();
        computerPage.clickOnFinalContinue();
    }
}
