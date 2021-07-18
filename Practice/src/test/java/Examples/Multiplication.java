package Examples;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		System.out.println("Which tables do you want?");
		Scanner input1 = new Scanner (System.in);
		int table = input1.nextInt();
		
		System.out.println("Enter the limit of the table:");
		Scanner input2 = new Scanner (System.in);
		int limit = input2.nextInt();
		
		for (int i=1; i<=limit; i++){
			
			int output = table * i;
			System.out.println(output);
			
		}
	}

}
