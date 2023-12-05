package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By returningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By emailId = By.name("email");
    By passWord = By.name("password");
    By loginButton = By.xpath("input[value='Login']");

    public void enterEmailId (String email){
        sendTextToElement(emailId,email);
    }
    public void enterPassword (String password){
        sendTextToElement(passWord,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String verifyReturningCustomerText (){
        return getTextFromElement(returningCustomer);
    }
}
