package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    public RegisterPage() {}

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement firstNameField;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement lastNameField;

    @FindBy(how = How.NAME, using = "phone")
    private WebElement phoneNumberField;

    @FindBy(how = How.NAME, using = "userName")
    private WebElement emailField;

    @FindBy(how = How.NAME, using = "address1")
    private WebElement address1stField;

    @FindBy(how = How.NAME, using = "address2")
    private WebElement address2ndtField;

    @FindBy(how = How.NAME, using = "city")
    private WebElement cityField;

    @FindBy(how = How.NAME, using = "postalCode")
    private WebElement postCodeField;

    @FindBy(how = How.NAME, using = "country")
    private WebElement countryField;

    @FindBy(how = How.NAME, using = "register")
    private WebElement submitButton;


    public void registerUser(){
        firstNameField.sendKeys("Ali");
        lastNameField.sendKeys("Ali");
        phoneNumberField.sendKeys("070123456");
        emailField.sendKeys("aliali@gmail.com");
        cityField.sendKeys("London");
        postCodeField.sendKeys("WC1 7TE");
        countryField.sendKeys("UNITED STATES");
        submitButton.click();
    }




}
