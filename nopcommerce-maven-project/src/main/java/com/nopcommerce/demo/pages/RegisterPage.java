package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By femaleRadioButton=By.id("gender-female");
    By firstNameField=By.id("FirstName");
    By lastNameField=By.name("LastName");
    By birthDayField=By.name("DateOfBirthDay");
    By birthMonthField=By.name("DateOfBirthMonth");
    By birthYearField=By.name("DateOfBirthYear");
    By emailField=By.id("Email");
    By passwordField=By.name("Password");
    By confirmPasswordField=By.name("ConfirmPassword");
    By registerButton=By.linkText("Register");
    By registerconfirmText=By.xpath("//div[contains(text(),'Your registration completed')]");

    public void clickOnFemaleRadioButton(){
        clickOnElement(femaleRadioButton);
    }
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void selectbirthDay(String birthDay){
        selectByVisibleTextFromDropDown(birthDayField,birthDay);
    }
    public void selectbirthMonth(String birthMonth){
        selectByVisibleTextFromDropDown(birthMonthField,birthMonth);
    }
    public void selectbirthYear(String birthYear){
        selectByVisibleTextFromDropDown(birthYearField,birthYear);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
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
    public String getRegistrationConfirmText(){
        return getTextFromElement(registerconfirmText);
    }


}
