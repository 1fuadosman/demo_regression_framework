package com.demo.framework.steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class HerokuHomePageSteps {

    @Then("^I can see the (.*) title page$")
    public void i_can_see_the_Welcome_to_the_internet_title_page(String pageTitle) throws Throwable {
        switch (pageTitle) {
            case "Welcome to the-internet":
       //         Assert.assertThat("Couldn't find the title " + pageTitle + "'.", newToursHomePage.signOnLinkTxt().contains(pageTitle), is(true));
                break;
        }
    }
}
