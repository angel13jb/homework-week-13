package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    By shippingTab = By.linkText("Shipping");
    By shippingText = By.id("page-title");
    By newTab = By.linkText("New!");
    By newArrivalText = By.xpath("//h1[@id='page-title']");
    By comingSoonTab = By.linkText("Coming soon");
    By comingSoonText = By.xpath("//h1[text()='Coming soon']");
    By contactUsTab = By.linkText("Contact us");
    By contactUsText = By.xpath("//h1[text()='Contact us']");

    public void clickOnShippingTab(){
        clickOnElement(shippingTab);
    }
    public String getShippingText(){
        return getTextFromElement(shippingText);
    }
    public void clickOnNewTab(){
        clickOnElement(newTab);
    }
    public String getNewArrivalText(){
        return getTextFromElement(newArrivalText);
    }
    public void clickOnComingSoonTab(){
        clickOnElement(comingSoonTab);
    }
    public String getComingSoonText(){
        return getTextFromElement(comingSoonText);
    }
    public void clickOnContactUsTab(){
        clickOnElement(contactUsTab);
    }
    public String getContactUsText(){
        return getTextFromElement(contactUsText);
    }
}
