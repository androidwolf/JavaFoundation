package test2;

public class TestClassLoader {

	public static void main(String[] args) {
		ClassLoader cl = TestClassLoader.class.getClassLoader();
		while (cl != null) {
			System.out.println(cl.getClass().getName());
			cl = cl.getParent();
		}
	}

}
