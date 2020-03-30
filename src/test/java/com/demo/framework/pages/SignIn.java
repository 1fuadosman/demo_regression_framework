package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn extends BasePage {

    public SignIn() {}

    @FindBy(how = How.NAME, using = "userName")
    private WebElement userNameField;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;


    @FindBy(how = How.NAME, using = "login")
    private WebElement loginBtn;

    public void authenticateUser(String username, String password){
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }




}
