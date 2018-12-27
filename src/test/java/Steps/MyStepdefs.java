package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    @Given("^code for logining into masters$")
    public void codeForLoginingIntoMasters()  {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("Code For Logining Into Masters");
    }

    @And("^running a consumer code jar inside the masters$")
    public void runningAConsumerCodeJarInsideTheMasters() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Code For Logining Into Masters");
    }

    @Then("^see the home page of masters$")
    public void seeTheHomePageOfMasters() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Code For Logining Into Masters");
    }
}
