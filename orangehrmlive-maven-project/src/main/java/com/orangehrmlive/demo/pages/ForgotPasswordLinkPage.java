package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordLinkPage extends Utility {
    By forgotPasswordLink=By.linkText("Forgot your password?");
    By forgotPasswordMessage=By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1");

    public void clickOnForgotYourPassword(){
        clickOnElement(forgotPasswordLink);
    }
    public String getForgotPasswordText(){
        return getTextFromElement(forgotPasswordMessage);
    }
}
