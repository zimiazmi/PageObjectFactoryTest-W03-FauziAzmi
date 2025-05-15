package com.juaracoding.PageObjectFactory.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 14/05/2025 11:10
@Last Modified 14/05/2025 11:10
Version 1.0
*/
public class LoginPage {
    private Actions actions;
    public LoginPage(WebDriver driver) {
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//input[@id='user-name']" )
    WebElement inputUsername;

    @FindBy (xpath = "//input[@id='password']")
    WebElement inputPassword;

    @FindBy (xpath = "//input[@id='login-button']")
    WebElement loginButton;

    public void fillUsername(String username){
        inputUsername.sendKeys(username);
    }
    public void fillPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void loginActions(String username, String password){
        actions.click(inputUsername).sendKeys(username)
                .pause(Duration.ofSeconds(3))
                .click(inputPassword).sendKeys(password)
                .pause(Duration.ofSeconds(3))
                .click(loginButton).build().perform();
    }
}
