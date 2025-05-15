package com.juaracoding.PageObjectFactory.pages;

import com.juaracoding.PageObjectFactory.utils.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 14/05/2025 12:58
@Last Modified 14/05/2025 12:58
Version 1.0
*/
public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;
    //private InventoryPage inventoryPage;

    @BeforeClass
    @Parameters({"url"})
    public void init(String url) {
        // Initialize the WebDriver and the page objects
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage(driver);
       // inventoryPage = new InventoryPage(driver);

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority =1 )
    @Parameters({"username", "password"})
    public void actionLoginTest(String username, String password) {
        // Perform login actions
        loginPage.loginActions(username,password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String actual ;
//        String expected = "Product";
//        Assert.assertEquals(actual,expected);
    }
}
