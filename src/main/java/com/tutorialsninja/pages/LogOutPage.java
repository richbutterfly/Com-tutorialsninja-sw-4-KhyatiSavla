package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {
    By textAccountLogOut = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueAfterLogOut = By.xpath("//h1[normalize-space()='Account Logout']");


    public String verifyTextAccountLogOut (){
        return getTextFromElement(textAccountLogOut);
    }
    public void clickOnContinueAfterLogOut (){
        clickOnElement(continueAfterLogOut);;
    }
}
