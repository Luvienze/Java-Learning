package enums;

public class Sizes {
	public static void main(String[] args) {
		Size size1 = Size.LARGE;
		String name = size1.name();
		System.out.println("Enum: " + name + " - " + size1);
		System.out.println("Ordinal: " + size1.ordinal());
		System.out.println("Abbreviation: " + size1.getAbbreviation());
		System.out.println("No: " + size1.no());
		
		System.out.println();
		
		Size size2 = Size.MEDIUM;
		String name2 = size2.name();
		System.out.println("Enum: " + name + " - " + size2);
		System.out.println("Ordinal: " + size2.ordinal());
		System.out.println("Abbreviation: " + size2.getAbbreviation());
		System.out.println("No: " + size2.no());
		
		System.out.println(Size.getDescription());
		
	}
}
