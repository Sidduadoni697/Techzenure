package Com.techzenure.day5;
/**
 * program to generate MarkSheet
 * @author siddu
 */


import java.util.Scanner;

public class MarkSheetWithArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name of student : ");
		String name = sc.nextLine();
		
		System.out.print("Enter number of subject : ");
		int sub = sc.nextInt();
		
		int[] n = new int[sub];
		for(int i = 0; i < sub; i++)
		{
			System.out.print("enter marks of subject-"+(i+1)+": ");
			n[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		System.out.println("\t REPORRT CARD");
		System.out.println("Name of student : "+name);
		System.out.println("--------------------------------------");

		System.out.println("Subject		Marks");
		System.out.println("--------------------------------------");
		int total = 0;
		for(int i=0; i<sub; i++)
		{
			System.out.println("Subject-"+(i+1)+"	"+n[i]);
			total += n[i];
		}
		System.out.println("--------------------------------------");

		float avg = total/sub;
		System.out.printf("TOTAL:%d\t AVERAGE:%.2f\n",total ,avg);
		
		System.out.println("--------------------------------------");
		sc.close();
	}

}
