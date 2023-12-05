package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By myAccountText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By textMyAccount =By.xpath("//h2[normalize-space()='My Account']");
    By continueAfterRegisterAccount = By.xpath("//a[contains(text(),'Continue')]");
    By continueAfterLogOut = By.xpath("//a[contains(text(),'Continue')]");
    By myAccountLink = By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']");

    By continueButton1= By.xpath("//a[@class= 'btn btn-primary']");

    public String verifyYourAccountHasBeenCreated (){
        return getTextFromElement(myAccountText);

    }
    public String verifyTextMyAccount (){
        return getTextFromElement(textMyAccount);

    }
    public void clickOnContinueAfterRegisterAccount (){
        clickOnElement(continueAfterRegisterAccount);
    }
    public void clickOnContinueAfterLogOut(){
        clickOnElement(continueAfterLogOut);
    }
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public void clickOnContinue1() {
        clickOnElement(continueButton1);
    }



}
