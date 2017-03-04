package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		String a = "123";
		String b = "123";
		String aa = new String("123");
		String bb = new String("123");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(aa == bb);
		System.out.println(aa.equals(bb));
		
		/*Pattern p = Pattern.compile(".{3,10}[0-9]");  //一下子吞最大的10个，然后发现不匹配吐出一个匹配
		//Pattern p = Pattern.compile(".{3,10}?[0-9]");  //这个加问号的就是不贪婪的，只读最少的就是aaaa5
		String s = "aaaa5bbbb68";
		Matcher m = p.matcher(s);
		if(m.find())
			p(m.start() + "-" + m.end());
		else 
			p("not match!");*/
	}

	private static void p(String string) {
		System.out.println(string);
	}

}
