package com.demo.framework.steps;

import com.demo.framework.base.Base;
import com.demo.framework.pages.FacebookLoginPage;
import com.demo.framework.utilities.CucumberUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FacebookLoginSteps extends Base {

    @Given("^I am at the login page$")
    public void i_am_at_the_login_page() throws Throwable {
        CurrentPage = GetInstance(FacebookLoginPage.class);
    }

    @When("^I Login as a registered user$")
    public void i_Login_as_a_registered_user(DataTable table) throws Throwable {
        CucumberUtil.convertDataTableToDict(table);
        CurrentPage.As(FacebookLoginPage.class).submitLoginCredentials(CucumberUtil.getCellValue("Email"), CucumberUtil.getCellValue("Password"));
    }
}
