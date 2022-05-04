package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By computerTab=By.linkText("Computers");
    By computerText=By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsTab=By.linkText("Electronics");
    By electronicText=By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelTab=By.linkText("Apparel");
    By apparelText=By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsTab=By.linkText("Digital downloads");
    By digitalDownloadsText=By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksTab=By.linkText("Books");
    By booksText=By.xpath("//h1[contains(text(),'Books')]");
    By jewelryTab=By.linkText("Jewelry");
    By jewelryText=By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsTab=By.linkText("Gift Cards");
    By giftCardsText=By.xpath("//h1[contains(text(),'Gift Cards')]");

    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }
    public String getComputerText(){
        return getTextFromElement(computerText);
    }
    public void clickOnElectronicsTab(){
        clickOnElement(electronicsTab);
    }
    public String getElectronicsText(){
        return getTextFromElement(electronicText);
    }
    public void clickOnApparelTab(){
        clickOnElement(apparelTab);
    }
    public String getApparelText(){
        return getTextFromElement(apparelText);
    }
    public void clickOnDigitalDownloadsTab(){
        clickOnElement(digitalDownloadsTab);
    }
    public String getDigitalDownloadsText(){
        return getTextFromElement(digitalDownloadsText);
    }
    public void clickOnBooksTab(){
        clickOnElement(booksTab);
    }
    public String getBooksText(){
        return getTextFromElement(booksText);
    }
    public void clickOnJewelryTab(){
        clickOnElement(jewelryTab);
    }
    public String getJewelryText(){
        return getTextFromElement(jewelryText);
    }
    public void clickOnGiftCardsTab(){
        clickOnElement(giftCardsTab);
    }
    public String getGiftCardsText(){
        return getTextFromElement(giftCardsText);
    }

}
