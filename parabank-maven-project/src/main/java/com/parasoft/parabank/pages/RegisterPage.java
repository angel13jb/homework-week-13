package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerLink=By.linkText("Register");
    By signingUpText=By.xpath("//h1[@class='title']");
    By firstNameField=By.id("customer.firstName");
    By lastNameField=By.id("customer.lastName");
    By addressField=By.name("customer.address.street");
    By cityField=By.name("customer.address.city");
    By stateField=By.name("customer.address.state");
    By zipCodeField=By.id("customer.address.zipCode");
    By phoneNumberField=By.id("customer.phoneNumber");
    By ssnField=By.name("customer.ssn");
    By userNameField=By.xpath("//input[@id='customer.username']");
    By passwordField=By.xpath("//input[@id='customer.password']");
    By confirmPasswordField=By.xpath("//input[@id='repeatedPassword']");
    By registerButton=By.xpath("//input[@value='Register']");
    By loggedInText=By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public String getSigningUpText(){
        return getTextFromElement(signingUpText);
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
    public void enterState(String state){
        sendTextToElement(stateField,state);
    }

    public void enterZipCode(String zipcode){
        sendTextToElement(zipCodeField,zipcode);
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }
    public void enterSSN(String ssn){
        sendTextToElement(ssnField,ssn);
    }
    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getLoggedInText(){
        return getTextFromElement(loggedInText);
    }

}
