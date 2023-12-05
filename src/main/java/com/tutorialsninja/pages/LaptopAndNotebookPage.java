package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNotebookPage extends Utility {

    By textLaptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By sortBy = By.xpath("//select[@id='input-sort']");
    By selectProductMacBook = By.xpath("//a[normalize-space()='MacBook']");

    public String verifyTextLaptopsAndNotebooks() {
        return getTextFromElement(textLaptopsAndNotebooks);
    }

    public void clickOnSortBy(String sort) {
       selectByVisibleTextFromDropDown(sortBy,sort);
    }
    public void clickOnMacBook() {
        clickOnElement(selectProductMacBook);
    }
}
