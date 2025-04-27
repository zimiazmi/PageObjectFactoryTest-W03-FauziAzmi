package com.juaracoding.PageObjectFactory.managers;

/*
IntelliJ IDEA 2024.3.3 (Community Edition)
Build #IC-243.24978.46, built on February 11, 2025
@Author zimiazmi a.k.a. Muhammad Fauzi Azmi
Java Developer
Created on 27/04/2025 11:53
@Last Modified 27/04/2025 11:53
Version 1.0
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;


public class ChromeManager {
    public static WebDriver buildDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        String tempProilePath = System.getProperty("user.dir") + "/tempChromeProfile";
        File tempProfile = new File(tempProilePath);
        if (!tempProfile.exists()) {
            tempProfile.mkdir();
        }
        options.addArguments("excludeSwitches",new String[]{"enable-automation"});

        return new ChromeDriver();
    }
}
