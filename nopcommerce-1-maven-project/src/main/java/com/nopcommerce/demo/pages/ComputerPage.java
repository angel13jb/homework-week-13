package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By dropDownField=By.xpath("//select[@id='products-orderby']");
    By buildOwnComputerImage=By.xpath("//div[@class=\"picture\"]/descendant::img[@alt='Picture of Build your own computer']");
    By addCartField=By.xpath("//div[@class=\"buttons\"]/child::button");
    By productDropDownMenu=By.xpath("//select[@id='products-orderby']");
    By buildMyOwnNameField = By.linkText("Build your own computer");
    By processerDropDown = By.xpath("//select[@id='product_attribute_1']");
    By ramDropDown = By.xpath("//select[@id='product_attribute_2']");
    By hddRadioButton = By.id("product_attribute_3_7");
    By osRadioButton = By.id("product_attribute_4_8");
    By totalCommander = By.id("product_attribute_5_12");
    By priceField = By.xpath("//span[@id='price-value-1']");
    By addCartButton=By.xpath("//button[@id='add-to-cart-button-1']");
    By productAddedMessage=By.xpath("//p[@class=\"content\"]");
    By closePopupFiled=By.xpath("//p[@class=\"content\"]/following-sibling::span");
    By shoppingCart=By.xpath("//span[contains(text(),'Shopping cart')]");
    By goCartFiled=By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartField = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By updatecartButton = By.xpath("//button[@id='updatecart']");
    By totalPriceField = By.xpath("//tr[@class=\"order-total\"]/child::td//following::td/child::span");
    By checkBox=By.xpath("//input[@id=\"termsofservice\"]");
    By checkOut=By.xpath("//button[@id='checkout']");
    By welcomeMessageField=By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By guestRegField=By.xpath("//strong[contains(text(),'Checkout as a guest or register')]");
    By fristName= By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName= By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email=By.xpath("//input[@id='BillingNewAddress_Email']");
    By countrydropDown=By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By stateDropDown=By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city=By.xpath("//input[@id='BillingNewAddress_City']");
    By address=By.xpath("//input[@id='BillingNewAddress_Address1']");
    By code=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phonnumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton=By.xpath("//button[@onclick=\"Billing.save()\"]");
    By cardDropDown=By.xpath("//select[@id='CreditCardType']");
    By Fname=By.xpath("//input[@id='CardholderName']");
    By cardNumberField=By.xpath("//input[@id='CardNumber']");
    By expireMonthDropDown=By.xpath("//select[@id='ExpireMonth']");
    By expireYear=By.xpath("//select[@id='ExpireYear']");
    By code1=By.xpath("//input[@id='CardCode']");
    By continueButton1=By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");
    By paymentmethodfield=By.xpath("//span[contains(text(),'Credit Card')]");
    By shippingMethodFiedl=By.xpath("//span[contains(text(),'Shipping Method:')]");
    By total=By.xpath("//span[@class=\"value-summary\"]/child::strong");
    By confirm=By.xpath("//button[contains(text(),'Confirm')]");
    By finalcontinueButton=By.xpath("//button[contains(text(),'Continue')]");

    public void selectFilter(String name){
        selectByVisibleTextFromDropDown(dropDownField,name);
    }
    public void mouseHoverToBuildComputerImage(){
        mouseHoverToElement(buildOwnComputerImage);
    }
    public  void clickOnAddCart(){
        clickOnElement(addCartField);
    }
    public void selectDropDownMenu(String name){
        selectByVisibleTextFromDropDown(productDropDownMenu,name);
    }
    public String getTextFromBuildMyOwnNameField() {
        return getTextFromElement(buildMyOwnNameField);
    }

    public void selectProcesser(String name) {
        selectByVisibleTextFromDropDown(processerDropDown, name);
    }

    public void selectRam(String name) {
        selectByVisibleTextFromDropDown(ramDropDown, name);

    }

    public void clickOnHddRadioButton() {
        clickOnElement(hddRadioButton);
    }

    public void clickOsRadioButton() {
        clickOnElement(osRadioButton);
    }

    public void ClickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public String getTextFromPriceFiled() {

        return getTextFromElement(priceField);
    }
    public  void clickOnAddCartButton(){
        clickOnElement(addCartButton);
    }
    public  String gettextFromProductAddedField(){
        return getTextFromElement(productAddedMessage);
    }
    public  void clickOnCloseButton(){
        clickOnElement(closePopupFiled);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void clickOnGoCart(){
        clickOnElement(goCartFiled);
    }
    public String gettextFromShoppingCartFeild() {
        return getTextFromElement(shoppingCartField);
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updatecartButton);
    }
    public String gettextfromTotalPriceField(){
        return getTextFromElement(totalPriceField);
    }
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOut);
    }
    public  String getTextFromWelcomeField(){
        return getTextFromElement(welcomeMessageField);
    }
    public void clickOnRegisterAsGuest(){
        clickOnElement(guestRegField);
    }
    public void enterfirstName(String name){
        sendTextToElement(fristName,name);
    }public void enterLastName(String name){
        sendTextToElement(lastName,name);
    }
    public void enterEmail(String name){
        sendTextToElement(email,name);
    }
    public void selectCountry(String name){
        selectByVisibleTextFromDropDown(countrydropDown,name);
    }
    public void selectState(String name){
        selectByVisibleTextFromDropDown(stateDropDown,name);
    }
    public void enterCity(String name){
        sendTextToElement(city,name);

    }
    public void enterAddress(String name){
        sendTextToElement(address,name);
    }
    public void enterCode(String num ){
        sendTextToElement(code,num);
    }
    public void enterPhonnumber(String num){
        sendTextToElement(phonnumber,num);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void selectCardType(String name){
        selectByVisibleTextFromDropDown(cardDropDown,name);
    }
    public void enterName(String name){
        sendTextToElement(Fname,name);
    }public void enterCardNumber(String num){
        sendTextToElement(cardNumberField,num);
    }
    public void selectenterExpiryMonth(String month){
        selectByVisibleTextFromDropDown(expireMonthDropDown, month);
    }public void selectenterExpiryYear(String year){
        selectByVisibleTextFromDropDown(expireYear, year);
    }
    public void enterCode1(String num){
        sendTextToElement(code1,num);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public String getPaymentMethodName(){
        return  getTextFromElement(paymentmethodfield);
    }public String getShippingMethodName(){
        return  getTextFromElement(shippingMethodFiedl);
    }
    public String gettinTotal(){
        return  getTextFromElement(total);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }
    public void clickOnFinalContinue(){
        clickOnElement(finalcontinueButton);
    }

}
