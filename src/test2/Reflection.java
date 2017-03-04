package test2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		String str = "yn.T";
		Class c = Class.forName(str);
		Object o = c.newInstance();
		Method[] methods = c.getMethods();
		for (Method m : methods) {
			if (m.getName().equals("m")) {
				m.invoke(o, 1, 2); // 参数是变长的
				Class returnType = m.getReturnType();
				System.out.println(returnType);
				for (Class paramType : m.getParameterTypes()) {
					System.out.println(paramType.getName());
				}
			}
		}
	}
}

class T {
	static {
		System.out.println("T loaded..");
	}

	T() {
		System.out.println("T constructed..");
	}

	public void mm() {
		System.out.println("mm invoke..");
	}

	public int m(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
}
