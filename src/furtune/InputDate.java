package furtune;

public class InputDate extends Api_Lunar_XmlParser {
	
	String inputYear;
	String inputMonth;
	String inputDay;
	double inputHour;
	
	public String getInputYear() {
		return inputYear;
	}
	public void setInputYear(String inputYear) {
		this.inputYear = inputYear;
	}
	public String getInputMonth() {
		return inputMonth;
	}
	public void setInputMonth(String inputMonth) {
		this.inputMonth = inputMonth;
	}
	public String getInputDay() {
		return inputDay;
	}
	public void setInputDay(String inputDay) {
		this.inputDay = inputDay;
	}
	public double getInputHour() {
		return inputHour;
	}
	public void setInputHour(double inputHour) {
		this.inputHour = inputHour;
	}
	
	public InputDate() {
		
	}
	
	public InputDate(String inputYear, String inputMonth, String inputDay, double inputHour) {
		super();
		this.inputYear = inputYear;
		this.inputMonth = inputMonth;
		this.inputDay = inputDay;
		this.inputHour = inputHour;
	}
	
	
}
