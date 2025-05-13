package com.juaracoding.PageObjectFactory.hook;

import com.juaracoding.PageObjectFactory.utils.Browser;
import com.juaracoding.PageObjectFactory.utils.DriverSingleton;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 13/05/2025 14:11
@Last Modified 13/05/2025 14:11
Version 1.0
*/


public class Hook {
    @BeforeSuite
    public void setUp() {
        DriverSingleton.setDriver(Browser.CHROME);
    }

    @AfterSuite
    public void tearDown() {
        DriverSingleton.exit();
    }

}
