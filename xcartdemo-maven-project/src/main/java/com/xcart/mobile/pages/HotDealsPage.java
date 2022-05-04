package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsPage extends Utility {
    By hotDealsLink=By.xpath("//li[@class='leaf has-sub']/following::span[text()='Hot deals']");
    By saleLink=By.linkText("Sale");
    By saleText=By.xpath("//h1[@id='page-title']");
    By bestsellersLink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='bestsellers/']");
    By bestsellerText=By.xpath("//h1[contains(text(),'Bestsellers')]");

    public void mouseHoverOnHotDealsLink(){
        mouseHoverToElement(hotDealsLink);
    }
    public void mouseHoverAndClickOnSaleLink(){
        mouseHoverToElementAndClick(saleLink);
    }
    public String getSaleText(){
        return getTextFromElement(saleText);
    }
    public void mouseHoverAndClickOnBestsellersLink(){
        mouseHoverToElementAndClick(bestsellersLink);
    }
    public String getBestsellersText(){
        return getTextFromElement(bestsellerText);
    }
}
