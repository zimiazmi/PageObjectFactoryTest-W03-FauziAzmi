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
Created on 17/05/2025 23:24
@Last Modified 17/05/2025 23:24
Version 1.0
*/

public class SideBar {

    @FindBy(xpath = "//*[@id='logout_sidebar_link']")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id='reset_sidebar_link']")
    WebElement resetAppStateButton;

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    WebElement menuButton;

    public SideBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void logout() {
        logoutButton.click();
    }
    public void clickMenuButton() {
        menuButton.click();
    }
}
