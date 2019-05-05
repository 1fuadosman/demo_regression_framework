package com.demo.framework.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class browser {

    private WebDriver _driver;

    public BrowserType Type;

    public browser(WebDriver driver) {
        _driver = driver;
    }

    public void goToUrl(String url)
    {
        _driver.get(url);
    }

    public void Maximize()
    {
        _driver.manage().window().maximize();
    }

    public void escape() {
        Actions action = new Actions(_driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }

    public void closeBrowser() {
        _driver.close();
    }


}

