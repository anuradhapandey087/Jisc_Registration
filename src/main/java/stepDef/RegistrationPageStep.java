package stepDef;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page.HomePage;
import page.RegistrationPage;

public class RegistrationPageStep {
    RegistrationPage regPage=new RegistrationPage();

    @Then("^User navigate to registration page$")
    public void user_navigate_registration_page() throws Exception
    {
        regPage.navigateRegistrationPage();
    }

    @And("^User enter registration page details for register$")
    public void user_enter_registration_page_details() throws Exception
    {
        regPage.enterRegistrationDetails();
    }

}

