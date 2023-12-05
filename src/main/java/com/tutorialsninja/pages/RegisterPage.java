package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By textRegisterAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.name("telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");
    By yesRadioButton = By.xpath("//label[normalize-space()='Yes']");
    By privacyPolicyCheckBox = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");


    public void enterFirstName (String firstname){
        sendTextToElement(firstNameField,firstname);
    }
    public void enterLastName (String lastname){
        sendTextToElement(lastNameField,lastname);
    }
    public void enterEmailId (String email){
        sendTextToElement(emailField,email);
    }
    public void enterTelephone (String telephone){
        sendTextToElement(telephoneField,telephone);
    }
    public void enterPassword (String password){
        sendTextToElement(passwordField,password);
    }
    public void confirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnYesRadioButton(){
        clickOnElement(yesRadioButton);
    }
    public void clickOnPrivatePolicyCheckBox (){
        clickOnElement(privacyPolicyCheckBox);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnContinueBtn(){
        clickOnElement(continueBtn);
    }

public String verifyTextRegisterAccount (){
        return getTextFromElement(textRegisterAccount);
}


}