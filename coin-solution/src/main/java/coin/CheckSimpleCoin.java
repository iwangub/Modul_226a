package coin;

public class CheckSimpleCoin {

	public static void main(String[] args) {
		Coin coin = new SimpleCoin();
		for (int i = 0; i < 16; i++) {
			System.out.println(coin + "->" + coin.toss());
		}
	}
}
