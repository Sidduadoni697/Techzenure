package Com.techzenure.day2;

/**
 * program to understand all the arithmetic operators
 * @author siddu
 */
public class AllArithmeticOperators {

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;

		// Addition
		int sum = num1 + num2;
		System.out.println("Addition: " + sum);

		// Subtraction
		int difference = num1 - num2;
		System.out.println("Subtraction: " + difference);

		// Multiplication
		int product = num1 * num2;
		System.out.println("Multiplication: " + product);

		// Division
		double quotient = (double) num1 / num2;
		System.out.println("Division: " + quotient);
		
		//Modules
		int mod = 0;
		mod = num1 % num2;
        System.out.println("Remainder = " + mod);
		
		// Increment operator
        System.out.println("num1 before pre-increment: " + num1);
        int preIncrementResult = ++num1;
        System.out.println("num1 after pre-increment: " + num1);
        System.out.println("Result of pre-increment: " + preIncrementResult);

        num1 = 10; // Reset num1 for post-increment
        System.out.println("num1 before post-increment: " + num1);
        int postIncrementResult = num1++;
        System.out.println("num1 after post-increment: " + num1);
        System.out.println("Result of post-increment: " + postIncrementResult);

        // Decrement operator
        // Decrement num2 by 1 using both pre-decrement and post-decrement
        System.out.println("num2 before pre-decrement: " + num2);
        int preDecrementResult = --num2;
        System.out.println("num2 after pre-decrement: " + num2);
        System.out.println("Result of pre-decrement: " + preDecrementResult);

        num2 = 5; // Reset num2 for post-decrement
        System.out.println("num2 before post-decrement: " + num2);
        int postDecrementResult = num2--;
        System.out.println("num2 after post-decrement: " + num2);
        System.out.println("Result of post-decrement: " + postDecrementResult);
	}

}