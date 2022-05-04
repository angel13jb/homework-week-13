package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField=By.id("user[email]");
    By passwordField=By.name("user[password]");
    By signInButton=By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By errorMessage=By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassWord(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignInButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
