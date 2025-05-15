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
import java.util.HashMap;
import java.util.Map;


public class ChromeManager {
    public static WebDriver buildDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        //path to chrome driver profile
        String chromeDriverPath = System.getProperty("user.dir") +"/tempChromeProfile";
        File chromeDriverDir = new File(chromeDriverPath);
        if (!chromeDriverDir.exists()) {
            chromeDriverDir.mkdirs();
        }
        options.addArguments("user-data-dir=" + chromeDriverPath);

        //pretend to be a real user
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        //turn off password saving
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credential_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        //disable infobars and notifications
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifications");

        //disable automation controlled
        options.addArguments("--disable-blink-features=AutomationControlled");

        return new ChromeDriver(options);
    }
}
