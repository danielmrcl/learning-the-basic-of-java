// Casting in Java

public class Casting {
    public static void main(String[] args) {
	short smallInteger = 57;

	int greaterInteger = smallInteger + 245; // Convert automaticially

	System.out.println("Greater Integer: " + greaterInteger);
	System.out.println("Small Integer: " + smallInteger);

	// --------------------------------------------------

	float myDecimal = 4.567f;

	int manInt = (int) myDecimal;

	System.out.println("Manual Int: " + manInt);
	System.out.println("Manual Decimal: " + myDecimal);
    }
}
