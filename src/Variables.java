
public class Variables {
	public static void main(String[] args) {
		// String
		String firstname = "Daniel";
		String lastname = "Silva";

		final String fullname = firstname + " " + lastname;

		System.out.println("Welcome back, " + firstname + "!");
		System.out.println("your fullname: " + fullname);

		// Integers:
		byte integer1 = 100;
		short integer2 = 10000;
		int integer3 = 100000000;
		long integer4 = 100000000000L;

		System.out.println("integer1: " + integer1);
		System.out.println("integer2: " + integer2);
		System.out.println("integer3: " + integer3);
		System.out.println("integer4: " + integer4);

		// float numbers
		float decimal1 = 5.22222f;
		double decimal2 = 5.222222222222d;

		System.out.println("decimal1: " + decimal1);
		System.out.println("decimal2: " + decimal2);

		// scientific numbers (e or E to indicate power of 10):
		float decimal3 = 5e3f;
		double decimal4 = 6E7d;

		System.out.println("decimal3: " + decimal3);
		System.out.println("decimal4: " + decimal4);
	}
}