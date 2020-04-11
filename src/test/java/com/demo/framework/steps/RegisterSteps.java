package com.demo.framework.steps;

import com.demo.framework.pages.RegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {

   RegisterPage registerPage = new RegisterPage();

    @When("^I register on the site$")
    public void i_register_on_the_site() throws Throwable {
        registerPage.registerUser();

    }



}
