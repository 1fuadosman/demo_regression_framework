package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewToursHomePage extends BasePage {

    public NewToursHomePage() {}

    @FindBy(how = How.LINK_TEXT, using = "SIGN-ON")
    private WebElement signOnLink;

    public String signOnLinkTxt() {
        return signOnLink.getText();
    }



}
