package co.com.bancolombia.certification.technicalevaluation.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.technicalevaluation.tasks.FilterHotels;
import co.com.bancolombia.certification.technicalevaluation.tasks.InputCityDestination;
import co.com.bancolombia.certification.technicalevaluation.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.technicalevaluation.tasks.Search;
import co.com.bancolombia.certification.technicalevaluation.tasks.SelectDate;
import co.com.bancolombia.certification.technicalevaluation.userinterface.PrincipalPage;
import co.com.bancolombia.certification.technicalevaluation.userinterface.BookingPage;
import co.com.bancolombia.certification.technicalevaluation.userinterface.FilterPopularPage;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SearchPopularHotelsStepDefinitions {

private BookingPage page;	
private Actor actor = Actor.named("yessica"); 	
@Managed (driver = "chrome") public WebDriver driver;

@Before
public void setUp(){
	actor.can(BrowseTheWeb.with(driver));
	driver.manage().window().maximize();
}
@Given("^the actor enters the page and search for name city$")
public void theActorEntersThePageAndLooksForCartagenaDeIndias() throws Exception {
	actor.wasAbleTo(OpenTheBrowser.on(page));
}


@When("^the actor performs the search$")
public void theActorPerformsTheSearch() throws Exception {
	actor.attemptsTo(InputCityDestination.on(PrincipalPage.INPUT_DESTINATION));
	actor.attemptsTo(SelectDate.on(PrincipalPage.CALENDER,
			PrincipalPage.START_DATE,PrincipalPage.FINAL_DATE));
	actor.attemptsTo(Search.on(PrincipalPage.BUTTON_SEARCH));
}

@And("^and select a pupil filter$")
public void andSelectAPupilFilter() throws Exception {
	actor.attemptsTo(FilterHotels.on(FilterPopularPage.CHECK_FILTER));
}

@Then("^validate the text of the first result$")
public void validateTheTextOfTheFirstResult(DataTable result) throws Exception {
    
  }
}
