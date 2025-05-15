package com.juaracoding.PageObjectFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 15/05/2025 09:47
@Last Modified 15/05/2025 09:47
Version 1.0
*/
public class InventoryPage {
    @FindBy(xpath ="//span[@class='title']")
    WebElement productHeader;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartBackpack;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    WebElement addToCartBikeLight;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCartTShirt;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    WebElement addToCartFleeceJacket;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    WebElement addToCartOnesie;

    @FindBy (xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    WebElement getAddToCartRedTShirt;

    @FindBy (xpath = "//*[@id='shopping_cart_container]")
    WebElement cartIcon;

    @FindBy (xpath = "//*[@class='shopping_cart_badge']")
    WebElement cartBadge;

    public InventoryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public String getProductHeader(){
        return productHeader.getText();
    }
    public String getCartBadge(){
        return cartBadge.getText();
    }
    public void addToCart(WebElement element){
        element.click();
    }
    public void goToCartPage(){
        cartIcon.click();
    }
}
