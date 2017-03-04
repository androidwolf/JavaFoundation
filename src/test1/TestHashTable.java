package test1;

import java.util.Hashtable;

public class TestHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("aa", "yxx");
		hashtable.put("bb", "xwp");
		hashtable.put("cc", "lyt");
		hashtable.put("dd", "yx");
		
		for (String string : hashtable.keySet()) {
			System.out.println(hashtable.get(string));
		}
		
	}

}
