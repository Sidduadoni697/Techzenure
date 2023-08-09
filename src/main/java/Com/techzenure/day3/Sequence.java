package Com.techzenure.day3;
/**
 * program to generate Sequence
 * @author siddu
 */

import java.util.Scanner;

@SuppressWarnings("unused")
public class Sequence {

	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		int i,j=1;
		System.out.println("First 15 element of the sequence are ");
		//num = sc.nextInt();
		 for(i=0; i<=15; i++)
		 {
			 System.out.print(j + " ");
			 j = j + 3;
		 }
		
	}

}