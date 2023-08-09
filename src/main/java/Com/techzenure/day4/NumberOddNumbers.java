package Com.techzenure.day4;
/**
 * program to generate Number Odd Number
 * @author siddu
 */

import java.util.Scanner;

public class NumberOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many odd numbers to be generated : ");
		int n = sc.nextInt();
		
		for(int i = 1; n > 0; i += 2)
		{
			System.out.print(i + " ");
			n--;
		}
		sc.close();
	}

}