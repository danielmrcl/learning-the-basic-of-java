
public class Ifelse {
	public static void main(String[] args) {
		boolean existArguments;

		// check if argument exist
		if (args.length >= 1) {
			existArguments = true;
		} else {
			existArguments = false;
		}

		// short hand if else:
		existArguments = (args.length >= 1) ? true : false;

		System.out.println("exist arguments: " + existArguments);
	}
}
