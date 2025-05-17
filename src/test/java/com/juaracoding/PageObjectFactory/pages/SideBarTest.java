package com.juaracoding.PageObjectFactory.pages;

import com.juaracoding.PageObjectFactory.utils.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 17/05/2025 23:34
@Last Modified 17/05/2025 23:34
Version 1.0
*/
public class SideBarTest {
    private SideBar sideBar;
    private WebDriver driver;

    @BeforeClass
    public void init() {
        driver = DriverSingleton.getDriver();
        sideBar = new SideBar(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(priority = 20)
    public void logoutTest() {
        sideBar.clickMenuButton();
        sideBar.logout();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
