package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.BestSellersPage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.SalePage;
import com.xcart.mobile.pages.ShoppingVinylIdolsPage;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingVinylIdolsPageTest extends TestBase {
ShoppingVinylIdolsPage shoppingVinylIdolsPage=new ShoppingVinylIdolsPage();
HotDealsPage hotDealsPage=new HotDealsPage();
BestSellersPage bestSellersPage=new BestSellersPage();
SalePage salePage=new SalePage();

@Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
    hotDealsPage.mouseHoverOnHotDealsLink();
    hotDealsPage.mouseHoverAndClickOnBestsellersLink();
    bestSellersPage.mouseHoverOnSortByLink();
    salePage.mouseHoverAndClickOnAtoZLink();
    shoppingVinylIdolsPage.mouseHoverAndClickVinylIdolLink();
    shoppingVinylIdolsPage.mouseHoverAndClickOnAddToCartButton();
    String expectedText="Product has been added to your cart";
    String actualText=shoppingVinylIdolsPage.getProductAddToCartText();
    Assert.assertEquals(expectedText,actualText,"Text not match");
    shoppingVinylIdolsPage.clickOnCloseSign();
    shoppingVinylIdolsPage.clickOnYourCartLink();
    Thread.sleep(10000);
    shoppingVinylIdolsPage.mouseHoverAndClickOnViewCart();
    String expectedText1="Your shopping cart - 1 item";
    String actualText1=shoppingVinylIdolsPage.getYourShoppingCartItem();
    Assert.assertEquals(expectedText1,actualText1,"Text not match");
    switchToAlert();
    acceptAlert();
    String expectedMessage="Item(s) deleted from your cart";
    String actualMessage=shoppingVinylIdolsPage.getItemDeletedFromCart();
    Assert.assertEquals(expectedMessage,actualMessage,"Text not match");
    String expectedMessage1="Your cart is empty";
    String actualMessage1=shoppingVinylIdolsPage.getEmptyCartText();
    Assert.assertEquals(expectedMessage1,actualMessage1,"Text not match");
}
}
