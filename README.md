# Learning Java
##### https://www.w3schools.com/java

### Hello World:
##### code file: `src/Hello.java`

``` Java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

- Every line of code in java must be inside a `class`.  
- A class should always start with an uppercase first letter.  
- Every Java program has a `class` name which must match the filename, and that every program must contain the `main()` method.  

### Comments:

``` Java
// Single line comment in Java
```
``` Java
/*
 * Multiple lines comment in Java
 */
```

### Variables:
##### code file: `src/Variables.java`

Declare a integer variable:

``` Java
int number = 23;

System.out.println(number);

// The output is 23
```

If you assign a new value to an existing variable, it will overwrite the previous value:

``` Java
int number = 23;

number = 20;

System.out.println(number);

// The output is 20
```

Constant variables are read-only, you declare with "final" or "constant" before the type:

``` Java
final String myname = "Daniel";

myname = "John";

System.out.println(myname);

/*
 * The output is an error, because the java can`t assign an
 * value in a final variable. 
 */
```

### Data types:

Primitive and Non-primitive:

- Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
- Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
- A primitive type has always a value, while non-primitive types can be null.
- A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
- The size of a primitive type depends on the data type, while non-primitive types have all the same size.

Examples of **primitive** types:
- `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`.

Examples of **non-primitive** types:
- `Strings`, `Arrays`, `Classes`, `Interface`, etc.

### Casting:
##### code file: `src/Casting.java`

**Widening Casting** (automatically) - converting a smaller type to a larger type size:
- `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`.  

**Narrowing Casting** (manually) - converting a larger type to a smaller size type:
- `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`.  

### Operators:

- **Arithmetic operators**: are used to perform common mathematical operations.
``` Java
+  // Addition
-  // Subtraction
*  // Multiplication
/  // Division
%  // Modulus
++ // Increment
-- // Decrement
```

- **Assignment operators**: are used to assign values to variables.
``` Java
=  // x = 5
+= // x += 3
-= // x -= 3
*= // x *= 3
/= // x /= 3
%= // x %= 3
&= // x &= 3
|= // x |= 3
^= // x ^= 3
>>=	// x >>= 3
<<=	// x <<= 3
```

- **Comparison operators**: are used to compare two values.
``` Java
== // Equal to
!= // Not equal
>    // Greater than
<    // Less than
>= // Greater than or equal to
<= // Less than or equal to
```

- **Logical operators**: are used to determine the logic between variables or values.
``` Java
&&	// Logical and
||	// Logical or
!   // Logical not
```

- **Bitwise operators**: are used to perform binary logic with the bits of an integer or long integer.
``` Java
&   // AND - Sets each bit to 1 if both bits are 1.  
|   // OR - Sets each bit to 1 if any of the two bits is 1.  
~   // NOT - Inverts all the bits.  
^   // XOR - Sets each bit to 1 if only one of the two bits is 1.  
<<  // Zero-fill left shift - Shift left by pushing zeroes in from the right and letting the leftmost bits fall off.  
>>  // Signed right shift - Shift right by pushing copies of the leftmost bit in from the left and letting the rightmost bits fall off.  
>>> // Zero-fill right shift - Shift right by pushing zeroes in from the left and letting the rightmost bits fall off. 
```

### Strings:
##### code file: `src/Strings.java`

Creating a string:
``` Java
String text = "Hello";
```

Some **String methods**:
``` Java
text.length();       // get the string length
text.toUppercase();  // change the characters to UPPER
text.toLowerCase();  // change the characters to LOWER
text.indexOf("lo");  // get the first occurrence of "lo"
text1.concat(text2); // concatenate two strings
```

### Math:
##### code file: `src/Mathematic.java`

Some **Math methods**:
``` Java
Math.max(num1, num2); // higher value between num1, num2
Math.min(num1, num2); // less value between num1, num2
Math.sqrt(num1);      // num1 square root
Math.abs(num2);       // num2 absolute value
```

Random numbers:
``` Java
Math.random();      // a random number between 0.0 and 1.0
Math.random() * 50; // a random number between 0.0 and 50.0
```

### Booleans:
##### code file: `src/Booleans.java`

Declare a boolean variable:
``` Java
boolean isHiger = true;
boolean isLower = false;
boolean isEqual = true;
```

Using expressions:
``` Java
boolean isHigher = 5 > 4; // true
boolean isLess = 5 < 4;   // false
boolean isEqual = 5 == 5; // true
```

### If...else:
##### code file: `src/Ifelse.java`

The "if" statements compute one (or more) conditions/expressions and execute a block of code if it is `true`, or skip if it is `false`.

Common way to use the "if ... else":
``` Java
if (condition1) {
    // CODE
}
else if (contition2) {
    // CODE
}
else {
    // CODE
}
```

One Line way to use the "if ... else":
``` Java
(condition) ? true : false;
```

### Switch:
##### code file: `src/Switching.java`

- The `switch` expression is evaluated once.
- The `break` is used to exit after run the code.
- The `default` is used to run an code if the condition is not in case block.
	- The last statement (`default`) not need a `break`.

``` Java
switch(expression) {
	case x:
		// code block
		break;
	case y:
		// code block
		break;
	default:
		// code block
}
```

