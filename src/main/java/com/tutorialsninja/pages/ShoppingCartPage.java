package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By textShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");

    By textHPLP3065 = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By textDeliveryDate = By.xpath("//small[normalize-space()='Delivery Date:2011-04-22']");
    By modelName = By.xpath("//td[normalize-space()='Product 21']");
    By totalAmount = By.xpath("//tbody//tr//td[6]");
    By textMacBook = By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By quantity = By.xpath("(//input[@name='quantity[85528]'])[1]");
    By updateSymbol = By.xpath("(//i[@class='fa fa-refresh'])[1]");
    By textModifiedCart = By.xpath("//div[@id='checkout-cart']/div[1]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");


    public String verifyTextShoppingCart(){
        return getTextFromElement(textShoppingCart);
    }
    public String verifyTextHPLP3065(){
        return getTextFromElement(textHPLP3065);
    }
    public String verifyTextDeliveryDate(){
        return getTextFromElement(textDeliveryDate);
    }
    public String verifyModelName(){
        return getTextFromElement(modelName);
    }
    public String verifyTotalAmount(){
        return getTextFromElement(totalAmount);
    }
    public String verifyTextMacBook(){
        return getTextFromElement(textMacBook);
    }

    public void changeQuantity (){
        clearQty(quantity);
        sendTextToElement(quantity,"2");
    }
    public void clickOnUpdateSymbol (){
        clickOnElement(updateSymbol);
    }
    public String verifyTheModifyCartText() {
        return getTextFromElement(textModifiedCart);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }

}
