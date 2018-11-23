package steps;

import cucumber.api.java.en.Given;


public class Steps {
    private steps.Config config = new steps.Config();
    Driver driver = new Driver();

    public Steps() {
        System.out.println("Hi\n");
    }

    @Given("^open portal$")
    public void open_portal() throws Throwable {
        System.out.println("Hi!");


        driver.launch();
    }
}
