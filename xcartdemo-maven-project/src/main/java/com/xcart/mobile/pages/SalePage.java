package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {
        By sortByLink=By.xpath("//span[contains(text(),'Sort by:')]");
        By AtoZLink=By.xpath("//a[@data-sort-by='translations.name'and @data-sort-order='asc']");
        By lowToHighLink=By.xpath("//a[@data-sort-order='asc' and @data-sort-by='p.price']");
        By ratesLink=By.xpath("//a[@data-sort-by='r.rating' and @data-sort-order='asc']");

        public void mouseHoverOnSortByLink(){
            mouseHoverToElement(sortByLink);
        }
        public void mouseHoverAndClickOnAtoZLink(){
            mouseHoverToElementAndClick(AtoZLink);
        }
        public void mouseHoverAndClickLowToHighLink(){
            mouseHoverToElementAndClick(lowToHighLink);

        }
        public void mouseHoverAndClickRatesLink(){
            mouseHoverToElementAndClick(ratesLink);
        }
}
