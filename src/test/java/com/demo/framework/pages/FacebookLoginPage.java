package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import com.demo.framework.base.DriverContext;
import com.demo.framework.config.Settings;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage extends BasePage {
    public FacebookLoginPage() {}

    @FindBy(how = How.NAME, using = "email")
    public WebElement loginEmail;

    @FindBy(how = How.ID, using = "pass")
    public WebElement loginPassword;

    @FindBy(how = How.ID, using = "loginbutton")
    public WebElement loginButton;

    @FindBy(how = How.LINK_TEXT, using = "Register here")
    public WebElement registerLink;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public WebElement forgotPasswordLink;

    public FacebookHomePage submitLoginCredentials(String emailAddress, String password){
        DriverContext.waitForElementVisible(loginEmail);
        loginEmail.sendKeys(emailAddress);
        loginPassword.sendKeys(password);
        loginButton.click();
        Settings.Logs.write("User submits credentials and login button clicked");
        return GetInstance(FacebookHomePage.class);
    }

}
