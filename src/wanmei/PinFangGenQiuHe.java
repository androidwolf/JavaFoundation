package wanmei;

import java.util.Formatter;
import java.util.Scanner;

/**
 *  ���еĶ������£�
	���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
	���������ж��飬ÿ��ռһ�У�����������n��n<10000����m(m<1000)��ɣ�
	n��m�ĺ�����ǰ������
	����ÿ���������ݣ���������еĺͣ�ÿ������ʵ��ռһ�У�Ҫ�󾫶ȱ���2λС����
	����
		81 4
		2 2
	���
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
