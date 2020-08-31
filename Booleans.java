public class Booleans {
    public static void main(String[] args) {
        // check the arguments
        if (args.length != 2) {
            System.out.printf("I need two arguments.\n");
            return;
        }

        // boolean expression
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        boolean less = n1 < n2;
        boolean higher = n1 > n2;

        if (less) {
            System.out.printf("%d is less then %d!\n", n1, n2);
        }
        else if (higher) {
            System.out.printf("%d is higher than %d!\n", n1, n2);
        }
        else {
            System.out.printf("These values are equal!\n");
        }
    }
}
