package co.com.bancolombia.certification.technicalevaluation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalPage {

	public static final Target INPUT_DESTINATION = Target.the("Input destination").locatedBy("//input[@id='ss']");
	public static final Target CALENDER = Target.the("calender").locatedBy("//div[@class='xp__dates-inner xp__dates__checkin']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
	public static final Target START_DATE = Target.the("start date").locatedBy("//div[1]//div[1]//div[2]//form[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[3]//div[1]//table[1]//tbody[1]//tr[3]//td[4]");
	public static final Target FINAL_DATE = Target.the("final date").locatedBy("//div[1]//div[1]//div[2]//form[1]//div[1]//div[2]//div[2]//div[1]//div[1]//div[3]//div[1]//table[1]//tbody[1]//tr[3]//td[5]");
	public static final Target BUTTON_SEARCH = Target.the("button search").locatedBy("//button[contains(@class,'sb-searchbox__button')]");

}
