public class Strings {
    public static void main (String[] args) {
        // get the arguments length
        System.out.printf("Length of arguments: %d\n", args.length);
        int argsLeng = args.length;

        // check if exist an argument
        if (argsLeng < 1) {
            System.out.printf("I need arguments!\n");
            return;
        }

        // initialize the text variable
        String text = "";

        // adding each argument into the text variable
        for (int i = 0; i < argsLeng; i++) {
            System.out.printf("%d argument: %s\n", i + 1, args[i]);

            if (i == 0) {
                text += args[i];
            }
            else {
                text += " " + args[i];
            }
        }

        // processing the text
        String textUpper = text.toUpperCase();
        String textLower = text.toLowerCase();
        int textLeng = text.length();

        // returning the text
        System.out.printf("text: %s\n", text);
        System.out.printf("upper: %s\n", textUpper);
        System.out.printf("lower: %s\n", textLower);
        System.out.printf("length: %d\n", textLeng);
    }
}
