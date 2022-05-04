package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.BestSellersPage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class BestSellerPageTest extends TestBase {
    BestSellersPage bestSellersPage=new BestSellersPage();
    HotDealsPage hotDealsPage=new HotDealsPage();
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnBestsellersLink();
        bestSellersPage.mouseHoverOnSortByLink();
        bestSellersPage.mouseHoverAndClickZtoA();
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnBestsellersLink();
        bestSellersPage.mouseHoverOnSortByLink();
        bestSellersPage.mouseHoverAndClickHighToLowList();
    }
    @Test
    public void verifyBestSellersProductsArrangeByRates(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnBestsellersLink();
        bestSellersPage.mouseHoverOnSortByLink();
        bestSellersPage.mouseHoverAndClickOnRatesLink();
    }
}
