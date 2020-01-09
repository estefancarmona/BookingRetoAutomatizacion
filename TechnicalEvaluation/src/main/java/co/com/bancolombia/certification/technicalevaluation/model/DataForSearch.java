package co.com.bancolombia.certification.technicalevaluation.model;

import cucumber.api.DataTable;

public class DataForSearch {
	private String nameCity;
	private String date;
	private String nameResult;

	public DataForSearch(DataTable data) {
		this.nameCity = data.asList(String.class).get(0);
		this.date = data.asList(String.class).get(1);
		this.nameResult = data.asList(String.class).get(2);
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNameResult() {
		return nameResult;
	}

	public void setNameResult(String nameResult) {
		this.nameResult = nameResult;
	}
}
