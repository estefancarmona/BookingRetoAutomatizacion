package co.com.bancolombia.certification.technicalevaluation.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class InputCityDestination implements Task{

	private Target inputName;
	
	public InputCityDestination(Target inputName) {
		this.inputName = inputName;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {	
	actor.attemptsTo(Enter.theValue("Cartagena de Indias").into(inputName));
	}
	
	public static InputCityDestination on (Target inputName) {
		return Tasks.instrumented(InputCityDestination.class, inputName);
	  }	 
}