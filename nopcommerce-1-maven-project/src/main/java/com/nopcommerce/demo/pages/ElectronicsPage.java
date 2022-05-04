package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By cellPhonFiled=By.xpath("//h1[contains(text(),'Cell phones')]");
    By listTab=By.xpath("//a[contains(text(),'List')]");
    By nokiaLumiaFiled=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
    By nokiaLumiaTextField=By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceField=By.xpath("//span[@id='price-value-20']");
    By addCartFiled=By.xpath("//button[@id='add-to-cart-button-20']");
    By addedInCartMessageField=By.xpath("//div[@id='bar-notification']/div[1]/p[1]");
    By closeBareField=By.xpath("//div[@class=\"bar-notification success\"]/descendant::span");
    By shoppingCart=By.xpath("//li[@id='topcartlink']");
    By goToCartFiled=By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartMessageField=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By checkBox=By.xpath("//input[@id='termsofservice']");
    By checkoutfield=By.xpath("//button[@id='checkout']");
    By registerTextFeild=By.xpath("//h1[contains(text(),'Register')]");
    By firstNameField=By.xpath("//input[@id='FirstName']");
    By lastNameField=By.xpath("//input[@id='LastName']");
    By email=By.xpath("//input[@id='Email']");
    By password=By.xpath("//input[@id='Password']");
    By confirmPassword=By.xpath("//input[@id='ConfirmPassword']");
    By registerButton=By.xpath("//button[@id='register-button']");
    By finalShoppingCartMassage=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By finalCheckBoxField=By.xpath("//input[@id=\"termsofservice\"]");
    By checkout=By.id("checkout");
    By firstName=By.id("BillingNewAddress_FirstName");
    By lastName=By.id("BillingNewAddress_LastName");
    By country=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city =By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By state=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By zipCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phonNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton=By.xpath("//button[@class=\"button-1 new-address-next-step-button\" and @name=\"save\"]");
    By creditcardradioButton=By.xpath("//input[@id='paymentmethod_1']");
    By continueButton1=By.xpath("//div[@id='payment-method-buttons-container']/descendant::button");
    By dropDownField = By.xpath("//select[@id='CreditCardType']");
    By nameField=By.xpath("//input[@id='CardholderName']");
    By cardNumber=By.xpath("//input[@id='CardNumber']");
    By expiryMonth=By.xpath("//select[@id='ExpireMonth']");
    By expiryYear=By.xpath("//select[@id='ExpireYear']");
    By code=By.xpath("//input[@id='CardCode']");
    By continueButton2=By.xpath("//div[@id=\"payment-info-buttons-container\"]/descendant::button");
    By confirmButton=By.xpath("//button[contains(text(),'Confirm')]");
    By finalContinueButton=By.xpath("//button[contains(text(),'Continue')]");
    public String gettingTextFromCellPhonField(){
        return getTextFromElement(cellPhonFiled);
    }
    public void clickOnListTab(){
        clickOnElement(listTab);
    }
    public void clickOnNokiaLumiaField(){
        clickOnElement(nokiaLumiaFiled);
    }
    public String gettextFromNokiaLumiaField(){
        return getTextFromElement(nokiaLumiaTextField);
    }
    public  String gettextFromPrice(){
        return  getTextFromElement(priceField);
    }
    public void clickOnAddToCartField(){
        clickOnElement(addCartFiled);
    }
    public String getTextFromAddedCardFieldMessage(){
        return getTextFromElement(addedInCartMessageField);
    }
    public void clickOnCloseBarField(){
        clickOnElement(closeBareField);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(goToCartFiled);
    }
    public String getMessageFromShoppingCartFiled(){
        return getTextFromElement(shoppingCartMessageField);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOutField(){
        clickOnElement(checkoutfield);
    }
    public String gettextFromRegisterFeidl(){
        return getTextFromElement(registerTextFeild);
    }
    public void enterFirstNameField(String name){
        sendTextToElement(firstNameField,name);
    }
    public void enterLastNameField(String lName){
        sendTextToElement(lastNameField,lName);
    }
    public void enterEmail(String eName){
        sendTextToElement(email,eName);
    }
    public void enterPassword(String passName){
        sendTextToElement(password,passName);
    }
    public void enterConfirmPassword(String confirmPassName){
        sendTextToElement(confirmPassword,confirmPassName);
    }
    public void clickOnregButton(){
        clickOnElement(registerButton);
    }
    public String gettextFromShopingCArtField(){
        return getTextFromElement(finalShoppingCartMassage);
    }
    public void clickOnFinalCheckBox(){
        clickOnElement(finalCheckBoxField);
    }
    public  void clickOnContinue(){
        clickOnElement(checkout);
    }
    public void enterFirstName(String fName){
        sendTextToElement(firstName,fName);
    }
    public void enterLastName(String lName){
        sendTextToElement(lastName ,lName);
    }
    public void enterCountry(String countryName){
        sendTextToElement(country,countryName);
    }
    public void enterCity(String cityName){
        sendTextToElement(city,cityName);
    }
    public void enteraddress(String input){
        sendTextToElement(address,input);
    }
    public void enterState(String stateName){
        sendTextToElement(state,stateName);
    }
    public void enterZipCode(String codeName){
        sendTextToElement(zipCode,codeName);
    }
    public void enterPhonNumber(String number){
        sendTextToElement(phonNumber,number);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditcardradioButton);
    }
    public void clickOnConinueButton1(){
        clickOnElement(continueButton1);
    }
    public void selectCard(String name) {
        selectByVisibleTextFromDropDown(dropDownField, name);
    }
    public void enterName(String fName){
        sendTextToElement(nameField,fName);
    }
    public  void enterCardNumber(String number){
        sendTextToElement(cardNumber,number);
    }
    public void selectExpiryMonth(String month){
        selectByVisibleTextFromDropDown(expiryMonth,month);
    }
    public void selectExpiryYear(String year){
        selectByVisibleTextFromDropDown(expiryYear, year);
    }
    public void enterCode(String number){
        sendTextToElement(code,number);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public  void clickOnFinalContinueButton(){
        clickOnElement(finalContinueButton);
    }
}
