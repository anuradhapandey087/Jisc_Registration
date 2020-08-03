package stepDef;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;

public class HomePageStep {
    HomePage hm=new HomePage();

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Exception {
        BaseTest.initialization();
    }

    @Then("^User verify registration link on home page$")
    public void user_verify_registration_link() throws Exception {
        hm.verifyRegistrationBtn();
    }

    @And("^User verify registration text on home page$")
    public void user_verify_registration_text() throws Exception {
        hm.verifyRegistrationText();
    }


}

