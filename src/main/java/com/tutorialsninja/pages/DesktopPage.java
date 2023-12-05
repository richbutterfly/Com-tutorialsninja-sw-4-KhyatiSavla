package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By desktopsText = By.xpath("//h2[normalize-space()='Desktops']");
    By productPath = By.xpath("//h4/a");
    By sortBy = By.xpath("//select[@id='input-sort']");
    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");


    public String getDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public void clickOnSortBy(String sort) {
        selectByVisibleTextFromDropDown(sortBy, sort);
    }

    public void clickOnHPLP3065() {
        clickOnElement(productHPLP3065);
    }


}
