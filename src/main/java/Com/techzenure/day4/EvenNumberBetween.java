package Com.techzenure.day4;
/**
 * program to Even Numbers
 * @author siddu
 */
import java.util.Scanner;

public class EvenNumberBetween {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int n2 = sc.nextInt();
		
		
		if(n1>n2)
		{
			System.out.println("Second number should be greater than first number");
			return;
		}
		
		System.out.printf("Even number between %d and %d are " , n1 , n2);
		for(int i = n1; i <= n2; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}