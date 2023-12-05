package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By desktopTab = By.xpath("//a[normalize-space()='Desktops']");
    By showAllDesktops = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    By laptopsAndNoteBooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By showAllLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
    By components = By.xpath("//a[normalize-space()='Components']");
    By showAllComponents = By.xpath("//a[contains(text(),'Show AllComponents')]");
    By myAccount = By.xpath("//a[@title='My Account']");
    By loginOption = By.linkText("Login");
    By registerOption = By.linkText("Register");
    By currency =  By.xpath("//i[@class='fa fa-caret-down']");
    By poundSterling = By.xpath("//button[normalize-space()='£Pound Sterling']");

    public void selectMenu(String menu) {
        List<WebElement> allMenu = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
        for (WebElement option : allMenu) {
            if (menu.equalsIgnoreCase(option.getText())) {
                option.click();
                break;
            }
        }
    }
    //Mouse hoover on “Desktops” Tab
    public void mouseHooverOnDesktops (){
        selectMenu("Desktops");
    }
    // Click on Show All Desktops option from dropdown
    public void ClickOnShowAllDesktops (){
        clickOnElement(showAllDesktops);
    }
    //Mouse hoover on “Laptops & Notebooks” Tab
    public void mouseHooverOnLaptopsAndNotebooks (){
        selectMenu("Laptops & Notebooks");
    }
    // Click on Show All Laptops and notebooks option from dropdown
    public void clickOnShowAllLaptopsAndNotebooks (){
        clickOnElement(showAllLaptopsAndNotebooks);
    }
    //Mouse hoover on “Components” Tab
    public void mouseHooverOnComponents(){
        selectMenu("Components");
    }
    // Click on Show All Components option from dropdown
    public void clickOnShowAllComponents (){
        clickOnElement(showAllComponents);
    }
    public void clickOnCurrencyDropDown (){
        clickOnElement(currency);
    }
    public void clickOnPoundSterling (){
        clickOnElement(poundSterling);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class = 'list-inline']//a"));
        for (WebElement list : options) {
            if (option.equalsIgnoreCase(list.getText())) {
                list.click();
                break;
            }
        }
    }
    // Click on My Account Option on top
    public void clickOnMyAccount (){
        selectMyAccountOptions("My Account");
    }// Click on Login Option from down options
    public void clickOnLoginOption (){
        selectMyAccountOptions("Login");
    }
    // Click on Register Option from down options
    public void clickOnRegisterOption (){
        selectMyAccountOptions("Register");
    }


}
