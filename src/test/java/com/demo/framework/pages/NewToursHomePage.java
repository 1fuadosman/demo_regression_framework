package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewToursHomePage extends BasePage {

    public NewToursHomePage() {}

    @FindBy(how = How.LINK_TEXT, using = "SIGN-ON")
    private WebElement signOnLink;

    @FindBy(how = How.LINK_TEXT, using = "REGISTER")
    private WebElement registerLink;

    @FindBy(how = How.LINK_TEXT, using = "SUPPORT")
    private WebElement supportLink;


    public String signOnLinkTxt() {
        return signOnLink.getText();
    }

    public String registerLinkTxt() {
        return registerLink.getText();
    }

    public String supportLinkTxt() {
        return supportLink.getText();
    }



}
