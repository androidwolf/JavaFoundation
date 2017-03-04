package ali;

public class FourArr {

	/**
	 * ����˼·�� ���ҷֱ�ʼ�ۼ���� �����Сʱ����±����ƣ��ұ�Сʱ�ұ��±�����
	 * ֵ���������ʱ��ȡ�м䲿���ڶ�����һ�����ϵ�������ͶԱȹ��̿��ܷ��ҵ��м��ƽ���
	 * �ǵ�ҪЧ�� ƽ���ĺ���֮ǰ�ĺ��Ƿ����
	 * @return
	 */

	private static Boolean resolve(int[] a) {
		if (a == null || a.length < 7)
			return false;
		boolean result = false;
		int i = 0;
		int j = a.length - 1;
		int suml = a[i];
		int sumr = a[j];
		while (i < j) {
			if (suml < sumr) {
				i++;
				suml += a[i];
			} else if (suml > sumr) {
				j--;
				sumr += a[j];
			} else if (suml == sumr) {
				result = checkMiddle(i + 1, j - 1, suml, a);
				if (result) {
					return result;
				} else {
					i++;
					suml += a[i];
				}
			}
		}
		return result;
	}

	private static boolean checkMiddle(int start, int end, int sum, int[] a) {

		int i = start + 1;
		int j = end - 1;
		int suml = a[i];
		int sumr = a[j];
		while (j > i) {
			if (suml < sumr) {
				i++;
				suml += a[i];
			} else if (suml > sumr) {
				j--;
				sumr += a[j];
			} else if (suml == sumr) {
				if (j - i == 2 && suml == sum) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 7, 1, 7, 3, 7 }; // true
		int[] a1 = { 10, 2, 13, 1, 1, 1, 1, 1 }; // false
		int[] a2 = { 10, 1, 1, 11, 1, 11, 1, 1, 10 }; // true
		System.out.println(resolve(a2));
	}

}
