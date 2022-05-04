package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField=By.id("txtUsername");
    By passwordField=By.name("txtPassword");
    By loginButton=By.xpath("//input[@id='btnLogin']");
    By welcomeText=By.xpath("//a[@id='welcome']");

    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
}
