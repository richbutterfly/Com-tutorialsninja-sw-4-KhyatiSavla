package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNotebookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/** 1. create class "TopMenuTest"
 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
 string
 1.2 This method should click on the menu whatever name is passed as parameter.
 Write the following Test:
 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
 1.1 Mouse hover on “Desktops” Tab and click
 1.2 call selectMenu method and pass the menu = “Show All Desktops”
 1.3 Verify the text ‘Desktops’
 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
 2.3 Verify the text ‘Laptops & Notebooks’
 3. verifyUserShouldNavigateToComponentsPageSuccessfully()
 3.1 Mouse hover on “Components” Tab and click
 3.2 call selectMenu method and pass the menu = “Show All Components”
 3.3 Verify the text ‘Components’
 *
 */
public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNotebookPage laptopAndNotebookPage = new LaptopAndNotebookPage();
    ComponentsPage componentsPage = new ComponentsPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHooverOnDesktops();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.ClickOnShowAllDesktops();
        //1.3 Verify the text ‘Desktops’
        Assert.assertEquals(desktopPage.getDesktopsText(), "Desktops");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHooverOnLaptopsAndNotebooks();
        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show All Laptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(laptopAndNotebookPage.verifyTextLaptopsAndNotebooks(), "Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHooverOnComponents();
        /// 3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.selectMenu("Show All Components");
        // 3.3 Verify the text ‘Components’
        Assert.assertEquals(componentsPage.verifyComponentsText(), "Components");
    }


}
