package test2;

public class TestMath {
	public static void main(String[] args) {
		double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
		for (double num : nums) {
			test(num);
		}
	}

	private static void test(double num) {
		System.out.print("Math.floor(" + num + ")=" + Math.floor(num) + "--");
		System.out.print("Math.round(" + num + ")=" + Math.round(num) + "--");
		System.out.print("Math.ceil(" + num + ")=" + Math.ceil(num));
		System.out.println();
	}
}
