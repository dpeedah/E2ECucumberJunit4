package cucumbertests;

import helperpackage.Car;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("Valid Registration value of {string}")
    public void validRegistrationValueOf(String arg0) {
        Assert.assertTrue(Car.isValid(arg0));
    }

    @When("the website {string} is live")
    public void theWebsiteIsLive(String arg0) {
        Assert.assertTrue(Car.isValid(arg0));
    }

    @Then("user should be taken to the {string} page")
    public void userShouldBeTakenToThePage(String arg0) {
        Assert.assertTrue(Car.isValid(arg0));
    }
}
