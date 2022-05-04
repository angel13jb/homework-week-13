package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField=By.name("username");
    By passwordField=By.xpath("//input[@name='password']");
    By loginButton=By.xpath("//input[@value='Log In']");
    By accountsOverviewText=By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By errorMessage=By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By logOutButton=By.linkText("Log Out");
    By customerLoginText=By.xpath("//h2[contains(text(),'Customer Login')]");

    public void enterUserName(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLogInButton(){
        clickOnElement(loginButton);
    }
    public String getAccountOverviewText(){
        return getTextFromElement(accountsOverviewText);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
    public String getCustomerLoginText(){
        return getTextFromElement(customerLoginText);
    }

}
