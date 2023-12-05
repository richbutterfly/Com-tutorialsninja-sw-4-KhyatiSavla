package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1. Create class “DesktopsTest”
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Mouse hover on Desktops Tab.and click
 * 1.2 Click on “Show All Desktops”
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Mouse hover on Currency Dropdown and click
 * 2.2 Mouse hover on £Pound Sterling and click
 * 2.3 Mouse hover on Desktops Tab.
 * 2.4 Click on “Show All Desktops”
 * 2.5 Select Sort By position "Name: A to Z"
 * 2.6 Select product “HP LP3065”
 * 2.7 Verify the Text "HP LP3065"
 * 2.8 Select Delivery Date "2023-11-27"
 * 2.9.Enter Qty "1” using Select class.
 * 2.10 Click on “Add to Cart” button
 * 2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
 * 2.12 Click on link “shopping cart” display into success message
 * 2.13 Verify the text "Shopping Cart"
 * 2.14 Verify the Product name "HP LP3065"
 * 2.15 Verify the Delivery Date "2023-11-27"
 * 2.16 Verify the Model "Product21"
 * 2.17 Verify the Todat "£74.73"
 */
public class DesktopsPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        // 1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHooverOnDesktops();
        // 1.2 Click on “Show All Desktops”
        homePage.ClickOnShowAllDesktops();
        // 1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortBy("Name: Z to A");
        // 1.4 Verify the Product will arrange in Descending order.
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);

        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortBy("Name (Z - A)");

        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        //2.1 Mouse hover on Currency Dropdown and click
        homePage.clickOnCurrencyDropDown();
        //2.2 Mouse hover on £Pound Sterling and click
        homePage.clickOnPoundSterling();
        //2.3 Mouse hover on Desktops Tab.
        homePage.mouseHooverOnDesktops();
        //2.4 Click on “Show All Desktops”
        homePage.ClickOnShowAllDesktops();
        //2.5 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortBy("Name (A - Z)");
        //2.6 Select product “HP LP3065”
        desktopPage.clickOnHPLP3065();
        //2.7 Verify the Text "HP LP3065"
        Assert.assertEquals(productPage.verifyProductText(),"HP LP3065");
        //2.8 Select Delivery Date "2023-11-27"
        productPage.datePicker();
        //2.9.Enter Qty "1” using Select class.
        productPage.enterQuantity();
        //2.10 Click on “Add to Cart” button
        productPage.clickOnAddToCart();
        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedText = "Success: You have added HP LP3065 to your shopping cart!";
        String actualText = productPage.verifySuccessText();
        Assert.assertEquals(actualText,expectedText);
        //2.12 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCart();
        //2.13 Verify the text "Shopping Cart"
        Assert.assertEquals(shoppingCartPage.verifyTextShoppingCart(),"Shopping Cart");
        //2.14 Verify the Product name "HP LP3065"
        Assert.assertEquals(shoppingCartPage.verifyTextHPLP3065(),"HP LP3065");
        //2.15 Verify the Delivery Date "2023-11-27"
        Assert.assertEquals(shoppingCartPage.verifyTextDeliveryDate(),"2023-11-27");
        //2.16 Verify the Model "Product21"
        Assert.assertEquals(shoppingCartPage.verifyModelName(),"Product21");
        //2.17 Verify the Total "£74.73"
        Assert.assertEquals(shoppingCartPage.verifyTotalAmount(),"£74.73");
    }
}


