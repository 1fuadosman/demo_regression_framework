package com.demo.framework.base;

import com.demo.framework.config.Settings;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverContext {

    public static WebDriver Driver;

    public static com.demo.framework.base.browser browser;

    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }

    public static void waitForPageToLoad() {
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        JavascriptExecutor jsExecutor = (JavascriptExecutor)Driver;

        ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor)Driver)
                .executeScript("return document.readyState").toString().equals("complete");

        //Get JS ready
        Boolean jsReady = jsExecutor.executeScript("return document.readyState").toString().equals("complete");

        if(!jsReady)
            wait.until(jsLoad);
        else
            Settings.Logs.write("Page is ready!");
    }

    public static void waitForElementVisible(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.visibilityOf(elementFindBy));
    }

    public static void waitForElementInVisible(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.invisibilityOfAllElements(elementFindBy));
    }

    public static void waitForElementClickable(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elementFindBy));
    }

    public static void waitForElementInvisible(final WebElement elementFindBy){
        WebDriverWait wait = new WebDriverWait(Driver, 30);
        wait.until(ExpectedConditions.invisibilityOf(elementFindBy));
    }

    public static void javascriptExecutionerClick(final WebElement elementFindBy) {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("arguments[0].click();", elementFindBy);
    }

    public static void waits() {
        Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;

    }










}
