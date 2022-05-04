package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.BestSellersPage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.SalePage;
import com.xcart.mobile.pages.ShoppingIphonePage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingIphonePageTest extends TestBase {
    HotDealsPage hotDealsPage=new HotDealsPage();
    BestSellersPage bestSellersPage=new BestSellersPage();
    SalePage salePage=new SalePage();
    ShoppingIphonePage shoppingIphonePage=new ShoppingIphonePage();
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnBestsellersLink();
        String expectedText="Bestsellers";
        String actualText= hotDealsPage.getBestsellersText();
        Assert.assertEquals(expectedText,actualText,"Text not match");
        bestSellersPage.mouseHoverOnSortByLink();
        salePage.mouseHoverAndClickOnAtoZLink();
        shoppingIphonePage.mouseHoverOnPhoneLink();
        shoppingIphonePage.mouseHoverAndClickOnAddTOCartButton();
        String expectedText1="Product has been added to your cart";
        String actualText1=shoppingIphonePage.getProductAddToCartText();
        Assert.assertEquals(expectedText1,actualText1,"Text not match");
        shoppingIphonePage.clickOnYourCart();
        Thread.sleep(10000);
        shoppingIphonePage.clickOnViewCart();
        String expectedText2="Your shopping cart - 1 item";
        String actualText2=shoppingIphonePage.getYourShoppingCartItemText();
        Assert.assertEquals(expectedText2,actualText2,"Text not match");
        String expectedSubTotal="Subtotal: $299.00";
        String actualSubTotal=shoppingIphonePage.getSubTotalText();
        Assert.assertEquals(expectedSubTotal,actualSubTotal,"Text not match");
        String expectedTotal="309";
        String actualTotal=shoppingIphonePage.getTotalText();
        Assert.assertEquals(expectedTotal,actualTotal,"Text not Match");
        shoppingIphonePage.clickOnCheckOutButton();
        String expectedText3="No account yet?";
        String actualText3=shoppingIphonePage.getNoAccountText();
        Assert.assertEquals(expectedText3,actualText3,"Text not match");
        shoppingIphonePage.enterEmail("xyz@gmail.com");
        shoppingIphonePage.clickOnContinueButton();
        String expectedText4="Secure Checkout";
        String actualText4=shoppingIphonePage.getSecureCheckOutText();
        Assert.assertEquals(expectedText4,actualText4,"Text not match");
        shoppingIphonePage.enterFirstName("Lily");
        shoppingIphonePage.enterLastName("Smith");
        shoppingIphonePage.enterAddress("10 Abbey street");
        shoppingIphonePage.enterCity("London");
        shoppingIphonePage.enterCountry("Uk");
        shoppingIphonePage.enterState("United Kingdom");
        shoppingIphonePage.enterZipCode("870042");
        shoppingIphonePage.clickOnCheckBox();
        shoppingIphonePage.enterPassword("Smith123");
        shoppingIphonePage.mouseHoverAndClickOnDeliveryMethod();
        shoppingIphonePage.mouseHoveAndClickOnPaymentMethod();
        shoppingIphonePage.mouseHoverAndClickOnPlaceOrder();
        String expectedMessage="Thank you for your order";
        String actualMessage=shoppingIphonePage.getThankYouText();
        Assert.assertEquals(expectedMessage,actualMessage,"Text not match");
    }
}
