package com.juaracoding.PageObjectFactory.pages;

import com.juaracoding.PageObjectFactory.utils.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 15/05/2025 14:16
@Last Modified 15/05/2025 14:16
Version 1.0
*/
public class InventoryPageTest {
    private WebDriver driver;
    private InventoryPage inventoryPage;
    private CartPage cartPage;

    @BeforeClass
    public void init(){
        driver = DriverSingleton.getDriver();
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void addToCartTest(){
        inventoryPage.addToCart(inventoryPage.addToCartBackpack);
    }
    @Test(priority = 3)
    public void verifiyCartTest(){
        String actual = inventoryPage.getCartBadge();
        String expected = "1";
        Assert.assertEquals(actual,expected);
    }
    @Test(priority = 4)
    public void navigateToCartTest(){
        inventoryPage.goToCartPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actual = cartPage.getCartHeader();
        String expected = "Your Cart";
        Assert.assertEquals(actual,expected);
    }


}
