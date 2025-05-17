package com.juaracoding.PageObjectFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 15/05/2025 14:21
@Last Modified 15/05/2025 14:21
Version 1.0
*/
public class CartPage {

    @FindBy(xpath = "//span[@class='title']")
    WebElement cartHeader;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @FindBy (xpath = "//*[@class='inventory_item_name']")
    private List<WebElement> cartItems;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public String getCartHeader(){
        return cartHeader.getText();
    }
    public void checkout(){
        checkoutButton.click();
    }
    public int countCartItems(){
        return cartItems.size();
    }
}
