package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingVinylIdolsPage extends Utility {
    By vinylIdolLink=By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By addTOCartButton=By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By productAddToCartText=By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeSign=By.cssSelector(".close");
    By yourCartButton=By.xpath("//div[@title='Your cart']");
    By viewCartButton=By.xpath("//span[contains(text(),'View cart')]");
    By yourShoppingCartItemText=By.xpath("//h1[text()='Your shopping cart - 1 item']");
    By emptyCartLink=By.xpath("//a[contains(text(),'Empty your cart')]");
    By itemDeleteText=By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By emptyCartText=By.xpath("//h1[text()='Your cart is empty']");

    public void mouseHoverAndClickVinylIdolLink(){
        mouseHoverToElementAndClick(vinylIdolLink);
    }
    public void mouseHoverAndClickOnAddToCartButton(){
        mouseHoverToElementAndClick(addTOCartButton);
    }
    public String getProductAddToCartText(){
        return getTextFromElement(productAddToCartText);
    }
    public void clickOnCloseSign(){
        clickOnElement(closeSign);
    }
    public void clickOnYourCartLink(){
        clickOnElement(yourCartButton);
    }
    public void mouseHoverAndClickOnViewCart(){
        mouseHoverToElementAndClick(viewCartButton);
    }
    public String getYourShoppingCartItem(){
        return getTextFromElement(yourShoppingCartItemText);
    }
    public void clickOnEmptyCartLink(){
        clickOnElement(emptyCartLink);
    }
    public String getItemDeletedFromCart(){
        return getTextFromElement(itemDeleteText);
    }
    public String getEmptyCartText(){
        return getTextFromElement(emptyCartText);
    }
}
