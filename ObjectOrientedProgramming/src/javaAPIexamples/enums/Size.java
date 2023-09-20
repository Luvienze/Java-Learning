package enums;

public enum Size {
	SMALL("S",1), MEDIUM("M",2), LARGE("L",3), EXTRA_LARGE("XL",4);
	private String abbreviation;
	private int no;
	
	private static String description;
	private static int count;
	
	static {
		System.out.println("in static initializer block");
		description = "these are the sizes";
	}
	
	{
		System.out.println("in object initializer block");
	}
	Size(String abbreviation, int no){
		this.abbreviation = abbreviation;
		this.no = no;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public int no() {
		return no;
	}
	public static String getDescription() {
		return description;
	}
	
}
