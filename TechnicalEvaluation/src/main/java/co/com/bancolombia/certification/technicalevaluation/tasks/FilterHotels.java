package co.com.bancolombia.certification.technicalevaluation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class FilterHotels implements Task{

	private Target checkFilter;

	
	public FilterHotels(Target checkFilter) {
		this.checkFilter = checkFilter;	
		
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {	
	actor.attemptsTo(Click.on(checkFilter));
	}
	
	public static FilterHotels on (Target checkFilter) {
		return Tasks.instrumented(FilterHotels.class, checkFilter);
	  }	 
}