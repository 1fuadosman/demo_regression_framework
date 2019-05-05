package com.demo.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FrameworkInitialize extends Base {

    public void initalizeBrowser(BrowserType browsertypes)
    {

        WebDriver driver=null;

        switch (browsertypes)
        {
            case Chrome:
            {
                String exePath = this.getClass().getClassLoader().getResource("webDrivers/chromedriver").getPath();
                System.setProperty("webdriver.chrome.driver", exePath);
                driver = new ChromeDriver();
                break;
            }
            case Firefox:
            {
                String exePath = this.getClass().getClassLoader().getResource("webDrivers/geckodriver").getPath();
                System.setProperty("webdriver.gecko.driver", exePath);
                driver = new FirefoxDriver();
                break;
            }
            case IE:
            {
                break;
            }
            case Safari:
            {
                driver = new SafariDriver();
                break;
            }
        }
        //Set the Driver
        DriverContext.setDriver(driver);
        //browser
        DriverContext.browser = new browser(driver);
    }

}
