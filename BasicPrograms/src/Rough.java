
public class Rough {
	public static void main(String[] args) {
		int[] a = { 1, 5, 9, 3, 9 };
		System.out.println(maxProfit(a));
	}

	public static int maxProfit(int[] prices) {
		int least = 999999;
		int a = 0;
		int result = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < least) {
				least = prices[i];
			}
			a = prices[i] - least;
			if (a > result) {
				result = a;
			}
		}
		return result;
	}
}
