package com.co.screenplay.stepdefinitions;

import com.co.screenplay.questions.ValidationShoes;
import com.co.screenplay.tasks.BuyShoes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class BuyStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp(){
        //OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Danilo");
        //OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^he user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^he user select a product$")
    public void heUserSelectAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuyShoes.click());

    }

    @Then("^he could see product$")
    public void heCouldSeeProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationShoes.compare()
        , Matchers.is(Matchers.equalTo("Baletas en cuero color verde esmeralda y animal print - 34"))));


    }

}
