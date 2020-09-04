
public class Switching {
	public static void main(String[] args) {
		// Check arguments:
		if (args.length < 1) {
			System.out.println("I need an argument!");
			System.out.println("type `help` as argument to print the list of possible arguments.");
			return;
		}
		
		// get length of arguments
		int leng = args.length;
		
		// Compute the argument:
		switch (args[0]) {
			case "help": // print the arguments list
				System.out.println("Listing the arguments:");
				System.out.println("help				- show this list");
				System.out.println("greeter	[name]			- show an greeter");
				System.out.println("sum	[num1] [num2] ...	- sum numbers");
				break;
				
			case "greeter": // welcome the user
				if (leng < 2) {
					// only print
					System.out.println("Hi! Welcome to my Java program! :D");
				}
				else {
					String name = args[1];
					
					// print with an name if it exists
					System.out.printf("Hi %s! Welcome to my Java program! :D\n", name);
				}
				break;
				
			case "sum": // sum of a numbers sequence
				int sum = 0;
				
				// sum all numbers in the argument
				for (int i = 1; i < leng; i++) {
					sum += Integer.parseInt(args[i]);
				}
				
				// shows sum
				System.out.printf("The sum is %d!\n", sum);
				break;
				
			default: // argument not found
				System.out.println("ERROR: argument not found.");
				System.out.println("type `help` as argument to print the list of possible arguments.");
		}
	}
}
