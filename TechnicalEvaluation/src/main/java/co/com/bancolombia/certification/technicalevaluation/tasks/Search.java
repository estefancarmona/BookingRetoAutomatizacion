package co.com.bancolombia.certification.technicalevaluation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Search implements Task{

	private Target buttonSearch;

	
	public Search(Target buttonSearch) {
		this.buttonSearch = buttonSearch;	
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {	
	actor.attemptsTo(Click.on(buttonSearch));
	}
	
	public static Search on (Target buttonSearch) {
		return Tasks.instrumented(Search.class, buttonSearch);
	  }	 
}