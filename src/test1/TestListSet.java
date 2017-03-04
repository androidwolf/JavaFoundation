package test1;

import java.util.LinkedList;
import java.util.List;

public class TestListSet {
	public static void main(String[] args) {
		List l1 = new LinkedList();
		for (int i = 0; i <= 5; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		l1.add(3, "a100");
		System.out.println(l1);
		String b = (String) l1.set(3, "a200");
		System.out.println(b);
		System.out.println(l1);

	}
}