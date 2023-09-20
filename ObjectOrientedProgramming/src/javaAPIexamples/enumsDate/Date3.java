package enumsDate;

public class Date3 {
	private DayOfMonth dayOfMonth;
	private Month month;
	private Year year;
	
	public Date3 (DayOfMonth dayOfMonth, Month month, Year year) {
		this.dayOfMonth = dayOfMonth;
		this.month = month;
		this.year = year;
	}
	public DayOfMonth getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth() {
		this.dayOfMonth = dayOfMonth;
	}
	public Month getMonth() {
		return month;
	}
	public void setMonth() {
		this.month = month;
	}
	public Year getYear() {
		return year;
	}
	public void setYear() {
		this.year = year;
	}
	

}
