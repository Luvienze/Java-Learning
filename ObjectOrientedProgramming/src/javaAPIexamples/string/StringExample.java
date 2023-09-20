package string;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "I love";
		String s2 = s1;
		String s3 = "Java";
		String s4 = s1 + s3;
		
		s1 += s3;
		
		System.out.println(s1 == s4);
		System.out.println(s1 == s2);
		
		String s5 = "Eren";
		String s6 = " ";
		String s7 = "Sonmez";
		String s8 = s5.concat(s6).concat(s7);
		System.out.println(s8);
	}
}
