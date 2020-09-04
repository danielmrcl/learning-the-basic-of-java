
public class Booleans {
	public static void main(String[] args) {
		// boolean expression
		int n1 = 5;
		int n2 = 5;

		boolean less = n1 < n2;
		boolean higher = n1 > n2;

		if (less) {
			System.out.printf("%d is less then %d!\n", n1, n2);
		} else if (higher) {
			System.out.printf("%d is higher than %d!\n", n1, n2);
		} else {
			System.out.printf("These values are equal!\n");
		}
	}
}
