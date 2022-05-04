package com.saucedemo.www.pages;

import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField=By.id("user-name");
    By passwordField=By.name("password");
    By loginButton=By.xpath("//input[@id='login-button']");
    By productMessage=By.xpath("//span[contains(text(),'Products')]");

    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getProductMessage(){
        return getTextFromElement(productMessage);
    }





}
