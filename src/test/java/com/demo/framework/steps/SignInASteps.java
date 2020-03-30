package com.demo.framework.steps;

import com.demo.framework.pages.SignIn;
import cucumber.api.java.en.When;

public class SignInASteps {

    SignIn signIn = new SignIn();

    @When("^I put user name (.*) and password (.*)")
    public void i_put_user_name_and_password(String username, String password) throws Throwable {
        signIn.authenticateUser(username, password);
    }


}
