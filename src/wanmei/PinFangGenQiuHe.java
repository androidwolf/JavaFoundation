package wanmei;

import java.util.Formatter;
import java.util.Scanner;

/**
 *  数列的定义如下：
	数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
	输入数据有多组，每组占一行，由两个整数n（n<10000）和m(m<1000)组成，
	n和m的含义如前所述。
	对于每组输入数据，输出该数列的和，每个测试实例占一行，要求精度保留2位小数。
	输入
		81 4
		2 2
	输出
		94.73
		3.41
 * @author yxx
 *
 */
public class PinFangGenQiuHe {

	public void pinFangGenQiuHe() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		while (!line.isEmpty()) {
			String[] nums = line.split(" ");
			double n = Double.valueOf(nums[0]);
			double m = Double.valueOf(nums[1]);
			//System.out.println(n + "---" + m);
			double sum = n;
			for (int i = 1; i < m; i++) {
				double temp = Math.sqrt(n);
				sum += temp;
				n = temp;
			}
			System.out.println(new Formatter().format("%.2f", sum).toString());
			line = scanner.nextLine();
		}

	}

	public static void main(String[] args) {
		new PinFangGenQiuHe().pinFangGenQiuHe();
	}

}
