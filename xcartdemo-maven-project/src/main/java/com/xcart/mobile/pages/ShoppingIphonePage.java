package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingIphonePage extends Utility {
    By iPhoneLink=By.xpath("//a[@class='fn url next-previous-assigned' and contains(text(),'Apple iPhone')]");
    By addToCartButton=By.xpath("//ul[@class='products-grid grid-list']/li[1]/descendant::button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By productAddToCartText=By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By yourCartButton=By.xpath("//div[@title='Your cart']");
    By viewCartButton=By.linkText("View cart");
    By shoppingCartItemText=By.xpath("//*[@id=\"page-title\"]");
    By subTotalText=By.xpath("//li[@class='subtotal']/parent::ul[@class='sums']");
    By totalText=By.xpath("//span[contains(text(),'309')]");
    By checkOutButton=By.xpath("//span[contains(text(),'Go to checkout')]");
    By notAccountText=By.xpath("//h3[contains(text(),'No account yet?')]");
    By emailField=By.xpath("//input[@id='email']");
    By continueButton=By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckOutText=By.xpath("//h1[contains(text(),' Secure Checkout')]");
    By firstNameField=By.id("shippingaddress-firstname");
    By lastNameField=By.id("shippingaddress-lastname");
    By addressField=By.name("shippingAddress[street]");
    By cityField=By.name("shippingAddress[city]");
    By countryField=By.id("shippingaddress-country-code");
    By stateField=By.id("shippingaddress-custom-state");
    By zipCodeField=By.name("shippingAddress[zipcode]");
    By checkBox=By.id("create_profile");
    By passwordField=By.id("password");
    By deliveryMethod=By.xpath("//span[contains(text(),'Local shipping')]");
    By paymentMethod=By.xpath("//span[contains(text(),'COD')]");
    By placeOrderButton=By.xpath("//span[contains(text(),'Place order: $311.03')]");
    By thankYouText=By.linkText("Thank you for your order");

    public void mouseHoverOnPhoneLink(){
        mouseHoverToElement(iPhoneLink);
    }
    public void mouseHoverAndClickOnAddTOCartButton(){
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getProductAddToCartText(){
        return getTextFromElement(productAddToCartText);
    }
    public void clickOnYourCart(){
        clickOnElement(yourCartButton);
    }
    public void clickOnViewCart(){
        clickOnElement(viewCartButton);
    }
    public String getYourShoppingCartItemText(){
        return getTextFromElement(shoppingCartItemText);
    }
    public String getSubTotalText(){
        return getTextFromElement(subTotalText);
    }
    public String getTotalText(){
        return getTextFromElement(totalText);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }
    public String getNoAccountText(){
        return getTextFromElement(notAccountText);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public String getSecureCheckOutText(){
        return getTextFromElement(secureCheckOutText);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterAddress(String address){
        sendTextToElement(addressField,address);
    }
    public void enterCity(String city){
        sendTextToElement(cityField,city);
    }
    public void enterCountry(String country){
        sendTextToElement(countryField,country);
    }
    public void enterState(String state){
        sendTextToElement(stateField,state);
    }
    public void enterZipCode(String zipcode){
        sendTextToElement(zipCodeField,zipcode);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void mouseHoverAndClickOnDeliveryMethod(){
        mouseHoverToElementAndClick(deliveryMethod);
    }
    public void mouseHoveAndClickOnPaymentMethod(){
        mouseHoverToElementAndClick(paymentMethod);
    }
    public void mouseHoverAndClickOnPlaceOrder(){
        mouseHoverToElementAndClick(placeOrderButton);
    }
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }



}
