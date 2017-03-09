package wanmei;

import java.util.Formatter;
import java.util.Scanner;

/**
 * ���еĶ������£� ���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
 * ���������ж��飬ÿ��ռһ�У�����������n��n<10000����m(m<1000)��ɣ� n��m�ĺ�����ǰ������
 * ����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС���� ���� 81 4 2 2 ��� 94.73 3.41
 * 
 * @author yxx
 * 
 */
public class PinFangGenQiuHe {

	public void pinFangGenQiuHe() {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String str = line;
		while (!line.isEmpty()) {
			line = scanner.nextLine();
			str = str + " " + line;
		}
		//System.out.println(str);
		done(str);
	}

	public void done(String str) {
		String[] nums = str.split(" ");
		for (int i = 0; i < nums.length; i += 2) {
			double n = Double.valueOf(nums[i]);
			double m = Double.valueOf(nums[i + 1]);
			// System.out.println(n + "---" + m);
			double sum = n;
			for (int j = 1; j < m; j++) {
				double temp = Math.sqrt(n);
				sum += temp;
				n = temp;
			}
			System.out.println(new Formatter().format("%.2f", sum).toString());
		}

	}

	public static void main(String[] args) {
		new PinFangGenQiuHe().pinFangGenQiuHe();
	}

}
