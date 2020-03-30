package com.demo.framework.steps;

import com.demo.framework.base.Base;
import com.demo.framework.base.DriverContext;
import com.demo.framework.config.Settings;
import com.demo.framework.pages.NewToursHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;

public class NewToursHomePageSteps extends Base {

    NewToursHomePage newToursHomePage = new NewToursHomePage();

    @Given("^I access (.*) page$")
    public void i_access_page(String pageName) throws Throwable {
        navigateTo(pageName);
    }

    @Then("^I can see that the (.*) link is displayed$")
    public void i_can_see_that_the_SIGN_ON_link_is_displayed(String linkText) throws Throwable {
        switch (linkText) {
            case "SIGN-ON":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.signOnLinkTxt().contains(linkText), is(true));
                break;
            case "REGISTER":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.registerLinkTxt().contains(linkText), is(true));
                break;
            case "SUPPORT":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.supportLinkTxt().contains(linkText), is(true));
                break;
            case "CONTACT":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.contactLinkTxt().contains(linkText), is(true));
                break;

            case "Flights":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.flightsLinkTxt().contains(linkText), is(true));
                break;

            case "Hotels":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.hotelsLinkTxt().contains(linkText), is(true));
                break;

            case "Car Rentals":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.carRentalsLinkTxt().contains(linkText), is(true));
                break;

            case "Cruises":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.cruisesLinkTxt().contains(linkText), is(true));
                break;

            case "Destination":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.destinationLink().contains(linkText), is(true));
                break;

            case "Vacation":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.vacationsLink().contains(linkText), is(true));
                break;

            case "SIGN-OFF":
                Assert.assertThat("Couldn't find the link text " + linkText + "'.", newToursHomePage.signOfflink().contains(linkText), is(true));
                break;



        }

    }


    private void navigateTo(String pageName) {
            switch (pageName) {
                case "home":
                    DriverContext.browser.goToUrl(Settings.AUT);
                    break;
        }

    }


}
