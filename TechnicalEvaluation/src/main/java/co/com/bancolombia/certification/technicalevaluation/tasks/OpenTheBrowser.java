package co.com.bancolombia.certification.technicalevaluation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OpenTheBrowser implements Task{
PageObject page;

public OpenTheBrowser(PageObject page) {
	this.page = page;
}
	@Override
	public <T extends Actor> void performAs(T actor) {		
		actor.wasAbleTo(Open.browserOn(page));		
	}
	
public static OpenTheBrowser on (PageObject page) {
	return Tasks.instrumented(OpenTheBrowser.class, page);
  }	         
}    