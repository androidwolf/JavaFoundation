package test2;

public class Coin {

	public int func(int num, int[] coin) {
		if (num == 0)
			return 0;
		for (int i = 0; i < coin.length; i++)
			if (num == coin[i])
				return 1;
		for (int i = 0; i < coin.length; i++) {
			if (num - coin[i] >= 0) {
				return func(num - coin[i], coin) + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] coin = { 5, 2, 1 };
		System.out.println(new Coin().func(20, coin));
	}

}
