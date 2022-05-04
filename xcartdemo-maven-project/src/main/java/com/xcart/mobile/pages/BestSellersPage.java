package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellersPage extends Utility {
    By sortByLink=By.xpath("//span[contains(text(),'Sort by:')]");
    By ZToALink=By.xpath("//a[@data-sort-by='translations.name'and @data-sort-order='desc']");
    By highToLowLink=By.xpath("//a[@data-sort-order='desc' and @data-sort-by='p.price']");
    By ratesLink=By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Rates')]");

    public void mouseHoverOnSortByLink(){
        mouseHoverToElement(sortByLink);
    }
    public void mouseHoverAndClickZtoA(){
        mouseHoverToElementAndClick(ZToALink);
    }
    public void mouseHoverAndClickHighToLowList(){
        mouseHoverToElementAndClick(highToLowLink);
    }
    public void mouseHoverAndClickOnRatesLink(){
        mouseHoverToElementAndClick(ratesLink);
    }
}
