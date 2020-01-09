package co.com.bancolombia.certification.technicalevaluation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/search_popular_hotels.feature",
		glue = {"co.com.bancolombia.certification.technicalevaluation.stepdefinitions"},
		snippets = SnippetType.CAMELCASE
)
public class SearchPopularHotels {

}

