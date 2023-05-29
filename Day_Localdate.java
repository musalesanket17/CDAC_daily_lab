package P1;

import java.time.LocalDate;

public class Day_Localdate {
	
	private int  day;
	private int  month;
	private int  year;
	
	public Day_Localdate(){
		LocalDate ld = LocalDate.now();
		day= ld.getDayOfMonth();
		month = ld.getMonthValue();
		year = ld.getYear();
		
		
	}
	

	public Day_Localdate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}




	public static void main(String[] args) {



	}




	public int getDay() {
		return day;
	}




	public void setDay(int day) {
		this.day = day;
	}




	public int getMonth() {
		return month;
	}




	public void setMonth(int month) {
		this.month = month;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}

}
