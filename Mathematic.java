public class Mathematic {
    public static void main(String[] args) {
        // check the arguments
        if (args.length < 2) {
            System.out.printf("Eu preciso de pelo menos dois número inteiros!\n");
            return;
        }

        // convert the arguments to integer
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        // max and min
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        System.out.printf("max: %d\n", max);
        System.out.printf("min: %d\n", min);

        // sqrt
        double n1_sqrt = Math.sqrt(n1);
        double n2_sqrt = Math.sqrt(n2);

        System.out.printf("first sqrt: %f\n", n1_sqrt);
        System.out.printf("secund sqrt: %f\n", n2_sqrt);

        // absolute value
        int n1_absolute = Math.abs(n1);
        int n2_absolute = Math.abs(n2);

        System.out.printf("first absolute: %d\n", n1_absolute);
        System.out.printf("secund absolute: %d\n", n2_absolute);

        // random numbers
        float dec_rand = (float) Math.random();
        int int_rand = (int) (Math.random() * 100);

        System.out.printf("decimal random: %f\n", dec_rand);
        System.out.printf("integer random: %d\n", int_rand);

        // logarithm
        double n1_log = Math.log10(n1);
        double n2_log = Math.log10(n2);

        System.out.printf("first log: %f\n", n1_log);
        System.out.printf("secund log: %f\n", n2_log);
    }
}
