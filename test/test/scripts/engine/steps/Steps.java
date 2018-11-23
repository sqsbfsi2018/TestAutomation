package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class Steps {
    private steps.Config config = new steps.Config();

    public Steps() {
    }

    @Given("^I have opened the portal$")
    public void iHaveOpenedThePortal() throws Throwable {
        System.out.println("Hi!\n\n");
    }

    @When("^I login page with$")
    public void iLoginPageWith(Map<String, String> table) throws Throwable {
        String username = table.get("Username");
        String password = table.get("Password");

        Driver driver = new Driver();

        driver.launch().login(username, password);
    }

    @Then("^I should see the home screen$")
    public void iShouldSeeTheHomeScreen() throws Throwable {
        System.out.println("Welcome to Mock Trading");
    }
}