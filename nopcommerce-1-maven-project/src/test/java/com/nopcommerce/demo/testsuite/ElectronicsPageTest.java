package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    ElectronicsPage electronicsPage=new ElectronicsPage();
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        topMenuPage.mouseHoverOnElectronicFiled();
        topMenuPage.clickOnCellPhoneFiled();
        String expactedText = "Cell phones";
        String actualtext = electronicsPage.gettingTextFromCellPhonField();
        Assert.assertEquals(actualtext, expactedText, "verify text");
        electronicsPage.clickOnListTab();
        Thread.sleep(2000);
        electronicsPage.clickOnNokiaLumiaField();
        String expactedTex = "Nokia Lumia 1020";
        String actualText = electronicsPage.gettextFromNokiaLumiaField();
        Assert.assertEquals(actualText, expactedTex, "verify text");
        String expactedPrice = "$349.00";
        String actualprice = electronicsPage.gettextFromPrice();
        Assert.assertEquals(actualprice, expactedPrice, "verify Price");
        WebElement element = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        element.clear();
        element.sendKeys("2");
        Thread.sleep(3000);
        electronicsPage.clickOnAddToCartField();
         String expactedMEssage = "The product has been added to your shopping cart";
        String actualMessage = electronicsPage.getTextFromAddedCardFieldMessage();
        Assert.assertEquals(actualMessage, expactedMEssage, "verify text");
        electronicsPage.clickOnCloseBarField();
        Thread.sleep(3000);
        electronicsPage.mouseHoverOnShoppingCart();
        electronicsPage.clickOnGoToCartButton();
        String expactedText1="Shopping cart";
        String actaulText1=electronicsPage.getMessageFromShoppingCartFiled();
        Assert.assertEquals(actaulText1,expactedText1,"verify Text");
       electronicsPage.clickOnCheckBox();
        electronicsPage.clickOnCheckOutField();
        String expactedRegText="Register";
        String actualtRegText=electronicsPage.gettextFromRegisterFeidl();
        Assert.assertEquals(actualtRegText,expactedRegText,"verify text");
        electronicsPage.enterFirstNameField("boby");
        electronicsPage.enterLastNameField("patel");
        electronicsPage.enterEmail("boby@gmail.com");
        electronicsPage.enterPassword("boby12");
        electronicsPage.enterConfirmPassword("boby12");
        Thread.sleep(3000);
        electronicsPage.clickOnregButton();
        electronicsPage.clickOnContinueButton();
        String expactedShopingCartText="Shopping cart";
        String actualShoppingCartText=electronicsPage.gettextFromShopingCArtField();
        Assert.assertEquals(actualShoppingCartText,expactedShopingCartText,"verify text ");
        electronicsPage.clickOnFinalCheckBox();
        electronicsPage.clickOnContinue();
        //fill the mendotery detail
        electronicsPage.enterFirstName("boby");
       electronicsPage.enterFirstName("patel");
        electronicsPage.enterCountry("India");
        electronicsPage.enterCity("Dehli");
        electronicsPage.enteraddress("6 london road");
        electronicsPage.enterState("Gujrat");
        electronicsPage.enterZipCode("12344");
        electronicsPage.enterPhonNumber("09967645636");
        electronicsPage.clickOnContinueButton();
        Thread.sleep(2000);
        electronicsPage.clickOnContinueButton();
        electronicsPage.clickOnCreditCard();
        electronicsPage.clickOnConinueButton1();
        electronicsPage.selectCard("Visa");
        electronicsPage.enterCardNumber("4111111111111111");
        electronicsPage.selectExpiryMonth("06");
        electronicsPage.selectExpiryYear("2025");
        electronicsPage.enterCode("2344");
        electronicsPage.clickOnContinueButton2();
        electronicsPage.clickOnConfirmButton();
        electronicsPage.clickOnFinalContinueButton();
        topMenuPage.clickOnLogOutField();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/","verify url");

    }}
