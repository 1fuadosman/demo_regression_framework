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


    @FindBy(how = How.LINK_TEXT, using = "CONTACT")
    private WebElement contactLink;

    @FindBy(how = How.LINK_TEXT, using = "Flights")
    private WebElement flightLink;

    @FindBy(how = How.LINK_TEXT, using = "HOTELS")
    private WebElement hotelsLink;

    @FindBy(how = How.LINK_TEXT, using = "Car Rentals")
    private WebElement carrentalsLink;


    public String signOnLinkTxt() {
        return signOnLink.getText();
    }

    public String registerLinkTxt() {
        return registerLink.getText();
    }

    public String supportLinkTxt() {
        return supportLink.getText();
    }

    public String contactLinkTxt() {return contactLink.getText();}

    public String flightsLinkTxt() {return flightsLinkTxt(); }

    public String hotelsOnLinkTxt() { return hotelsOnLinkTxt(); }

    public String carrentals() {
        return carrentalsLink.getText();
    }

}
