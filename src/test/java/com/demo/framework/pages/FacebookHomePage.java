package com.demo.framework.pages;

import com.demo.framework.base.BasePage;
import com.demo.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookHomePage extends BasePage {

    public FacebookHomePage() {}

    @FindBy(how = How.ID, using = "u_0_c")
    public WebElement homeTabTitle;


    public String getHomeTabTitle() {
        DriverContext.waitForElementVisible(homeTabTitle);
        return homeTabTitle.getText();

    }

}
