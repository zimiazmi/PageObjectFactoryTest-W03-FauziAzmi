package com.juaracoding.PageObjectFactory.strategies;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 27/04/2025 11:50
@Last Modified 27/04/2025 11:50
Version 1.0
*/

import org.openqa.selenium.WebDriver;
import com.juaracoding.PageObjectFactory.utils.Browser;
import com.juaracoding.PageObjectFactory.managers.ChromeManager;
import com.juaracoding.PageObjectFactory.managers.FirefoxManager;


public class DriverStrategies {

    public static WebDriver setStrategy(String browser){
        if (browser.equals(Browser.CHROME)){
            return ChromeManager.buildDriver();
        }else if (browser.equals(Browser.FIREFOX)){
             return FirefoxManager.buildDriver();
        }else {
            return ChromeManager.buildDriver();
        }
    }

}
