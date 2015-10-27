package DoWhile;

import java.util.Scanner;

public class App {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("Enter a number: ");
		int value = scan.nextInt();
		while(value != 5){
			/*
			 * not got since the below codes are identical to the above lines of code
			 */
		/*
			System.out.println("Enter a number: ");
			value = scan.nextInt();
		}
		*/
		int value = 0;//Global declaration, so that it can be used in both do and while loops
		do{
			System.out.println("Enter a number: ");
			value = scan.nextInt();
		}
		while(value != 5);
		System.out.println("Got 5");
	}
}
