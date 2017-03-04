package test2;

public class MaxSubSum {

	public int maxSubSum(int[] a) {
		if (a == null || a.length == 0)
			return 0;

		int maxSum = 0, thisSum = 0;
		for (int i = 0; i < a.length; i++) {
			thisSum += a[i];
			if (thisSum > maxSum)
				maxSum = thisSum;
			if (thisSum < 0)
				thisSum = 0;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 8, -5, -2, 3, -2, 5 };
		System.out.println(new MaxSubSum().maxSubSum(a));
	}

}
