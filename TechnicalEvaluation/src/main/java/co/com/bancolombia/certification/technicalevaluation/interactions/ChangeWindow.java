package co.com.bancolombia.certification.technicalevaluation.interactions;

import java.util.Set;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ChangeWindow implements Interaction{
public String parentWindow;
public Set <String> handles;
	@Override
	public <T extends Actor> void performAs(T actor) {
		parentWindow = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
		handles = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
		
		for(String windowHandle : handles){
			
		if(!windowHandle.equals(parentWindow))
		{
			BrowseTheWeb.as(actor).getDriver().switchTo().window(windowHandle);
		 }
		}	
	}

}
