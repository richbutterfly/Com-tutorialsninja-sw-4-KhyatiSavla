package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

    By productText = By.xpath("//h1[normalize-space()='HP LP3065']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By successMsgForMacBook = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By quantity = By.xpath("//input[@id='input-quantity']");
    By textMacBook = By.xpath("//h1[normalize-space()='MacBook']");

    public String verifyProductText() {
        return getTextFromElement(productText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifySuccessText() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public void enterQuantity() {
        sendTextToElement(quantity, "1");
    }
    public String verifyTextMacBook() {
        return getTextFromElement(textMacBook);
    }
    public String verifySuccessMsgForMacBook() {
        return getTextFromElement(successMsgForMacBook);
    }

    public void datePicker() {
        String year = "2023";
        String month = "November";
        String date = "27";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }
}
