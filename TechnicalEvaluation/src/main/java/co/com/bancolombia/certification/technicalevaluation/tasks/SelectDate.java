package co.com.bancolombia.certification.technicalevaluation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Task{

	private Target calender;
	private Target startDate;
	private Target finalDate;
	
	public SelectDate(Target calender, Target startDate, Target finalDate) {
		this.calender = calender;	
		this.startDate = startDate;
		this.finalDate = finalDate;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {	
	actor.attemptsTo(Click.on(calender),
			Click.on(startDate),
			Click.on(finalDate));
	}
	
	public static SelectDate on (Target calender, Target startDate, Target finalDate) {
		return Tasks.instrumented(SelectDate.class, calender, startDate, finalDate);
	  }	 
}