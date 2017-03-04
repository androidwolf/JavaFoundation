package test2;

import java.util.Scanner;

public class OutputMin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;

		int n = input.nextInt();
		int a[] = new int[n];
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数组");
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		for (j = 0; j < n; j++) {
			int f = 0;

			for (k = 0; k < n; k++) {
				if (a[j] == a[k]) {
					f++;
				}
			}
			if (f == 1) {
				System.out.println(a[j]);
				break;
			}
		}
	}
}
