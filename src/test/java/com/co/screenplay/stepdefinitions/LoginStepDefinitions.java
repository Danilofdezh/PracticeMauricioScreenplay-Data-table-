package com.co.screenplay.stepdefinitions;

import com.co.screenplay.models.DataLogin;
import com.co.screenplay.tasks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class LoginStepDefinitions {

    @When("^he user his log$")
    public void heUserHisLog(List<DataLogin>dataLoginList) {
        DataLogin dataLogin;
        dataLogin = dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter(dataLogin));
    }

    @Then("^he could see id$")
    public void heCouldSeeId() {

    }
}
