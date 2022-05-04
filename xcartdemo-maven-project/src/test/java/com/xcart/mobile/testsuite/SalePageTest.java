package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.SalePage;
import com.xcart.mobile.testbase.TestBase;
import org.testng.annotations.Test;

public class SalePageTest extends TestBase {
    SalePage salePage=new SalePage();
    HotDealsPage hotDealsPage=new HotDealsPage();
    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnSaleLink();
        salePage.mouseHoverOnSortByLink();
        salePage.mouseHoverAndClickOnAtoZLink();
    }
    @Test
    public void verifySaleProductsArrangeLowToHigh(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnSaleLink();
        salePage.mouseHoverOnSortByLink();
        salePage.mouseHoverAndClickLowToHighLink();
    }
    @Test
    public void verifySalesProductsArrangeByRates(){
        hotDealsPage.mouseHoverOnHotDealsLink();
        hotDealsPage.mouseHoverAndClickOnSaleLink();
        salePage.mouseHoverOnSortByLink();
        salePage.mouseHoverAndClickRatesLink();
    }
}
