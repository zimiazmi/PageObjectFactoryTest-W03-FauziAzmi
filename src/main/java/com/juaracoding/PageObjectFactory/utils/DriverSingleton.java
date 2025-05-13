package com.juaracoding.PageObjectFactory.utils;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 27/04/2025 07:12
@Last Modified 27/04/2025 07:12
Version 1.0
*/

import com.juaracoding.PageObjectFactory.strategies.DriverStrategies;
import org.openqa.selenium.WebDriver;


public class DriverSingleton {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            throw new IllegalStateException("Driver not initialized. Call setDriver() first.");
        }
        return driver;
    }

    public static void setDriver(String browser) {
        if (driver == null) {
            driver = DriverStrategies.setStrategy(browser);
        }
    }
    public static void exit() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
