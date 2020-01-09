package co.com.bancolombia.certification.technicalevaluation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class FilterPopularPage {

	public static final Target CHECK_FILTER = Target.the("check the filter hotels").locatedBy("//div[@id='left_col_wrapper']//div[4]//div[2]//a[1]//label[1]//div[1]");
	public static final Target NAME_RESULT = Target.the("nsmr result search").locatedBy("//span[contains(text(),'Hampton by Hilton Cartagena')]");
	
}
