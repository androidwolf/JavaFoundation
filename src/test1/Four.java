package test1;

public class Four {
	
	public static void main(String[] args) {
		int num = 0, x, y, m, n;
		int []a = new int[3];
		for(int i = 1000; i <= 9999; i ++) {
			x = i % 10;
			y = (i - x) % 10;
			m = (i - y * 10 -x) % 10;
			n = (i - m *100 - y * 10 - x) % 10;
			num = x + y + m +n;
			for(int b = 1; b < 10; b ++) {
				for(int c = 0; c < 10; c ++)  {
					for(int d = 0; d < 10; d ++) {
						for(int e = 0; e < 10; e ++) {
							if((b*16*16*16 + c*16*16 + d*16 +e)==i && (b+c+d+e)==num) {
								for(int b1 = 1; b1 < 10; b1 ++) {
									for(int c1 = 0; c1 < 10; c1 ++)  {
										for(int d1 = 0; d1 < 10; d1 ++) {
											for(int e1 = 0; e1 < 10; e1 ++) {
												if((b1*12*12*12 + c1*12*12 + d1*12 +e1)==i && (b1+c1+d1+e1)==num) {
													System.out.println(i);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
