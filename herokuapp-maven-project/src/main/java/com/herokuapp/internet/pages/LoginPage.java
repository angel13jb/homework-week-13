package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By secureAreaText = By.xpath("//*[@id=\"content\"]/div/h2");
    By userNameInvalidText=By.xpath("//div[@id='flash']");
    By passwordInvalidText=By.xpath("//div[@id='flash']");

    public void enterUserName(String username){
        sendTextToElement(usernameField,username);
    }
    public void enterPassWord(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getSecureAreaText(){
        return getTextFromElement(secureAreaText);
    }
    public String getUserNameInvalidText(){
        return getTextFromElement(userNameInvalidText);
    }
    public String getPasswordInvalidText(){
        return getTextFromElement(passwordInvalidText);
    }

}
