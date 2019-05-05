package com.demo.framework.steps;

import com.demo.framework.base.Base;
import com.demo.framework.pages.FacebookHomePage;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class FacebookHomePageSteps extends Base {

    @Then("^I should be logged in my home page$")
    public void i_should_be_logged_in_my_accounts_page() throws Throwable {
        CurrentPage = GetInstance(FacebookHomePage.class);
        Assert.assertEquals("Unable to locate Home tab title", "Home", CurrentPage.As(FacebookHomePage.class).getHomeTabTitle());

    }

}
