package Com.techzenure.day1;

/**
 * program to generate bill based on items
 * @author siddu
 */
import java.util.Scanner;


public class BillGeneration {

	public static void main(String[] args) {
             @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		
		int pz = 100;
		int pf = 20;
		int cd = 10;
		System.out.print("Enter the number of  pizza ordered 		: ");
		int pzo = sc.nextInt();
		
		System.out.print("Enter the number of  puffs ordered 		: ");
		int pfo = sc.nextInt();
		
		System.out.print("Enter the number of  cold drinks ordered 	: ");
		int cdo = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Bill details");
		System.out.println("No of pizzas      : " + pzo + " 		| cost : " + pzo * pz);
		System.out.println("No of puffs       : " + pfo + " 		| cost : " + pfo * pf);
		System.out.println("No of cool drinks : " + cdo + " 		| cost : " + cdo * cd);
		
		int fb = (pzo * pz)+(pfo * pf)+(cdo * cd);
		System.out.println("Total price = " + fb);
		System.out.println("ENJOY THE SHOW!!");

				
		
		
		

	}
}





