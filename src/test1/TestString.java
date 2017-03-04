package test1;

public class TestString {
	public static void main(String[] args) {
		String s1 = "Monday";
		String s2 = new String("Monday");
		String s3 = new String("Monday");
		String s4 = s2;
		if (s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		if (s2 == s3)
			System.out.println("s2 == s3");
		else
			System.out.println("s2 != s3");
		if (s2.equals(s3))
			System.out.println("s2 equals s3");
		else
			System.out.println("s2 not equals s3");
		if (s2 == s4)
			System.out.println("s2 == s4");
		else
			System.out.println("s2 != s4");
		if (s2.equals(s4))
			System.out.println("s2 equals s4");
		else
			System.out.println("s2 not equals s4");
		if (s1.equals(s2))
			System.out.println("s1 equals s2");
		else
			System.out.println("s1 not equals s2");
	}
}

/*
 * public class TestString { public static void main(String[] args) { String s1
 * = "Monday"; String s2 = new String("Monday"); s2 = s2.intern(); if (s1 == s2)
 * System.out.println("s1 == s2"); else System.out.println("s1 != s2"); if
 * (s1.equals(s2)) System.out.println("s1 equals s2"); else
 * System.out.println("s1 not equals s2"); } }
 */