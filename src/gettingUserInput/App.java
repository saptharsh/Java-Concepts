package gettingUserInput;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// Create a Scanner Obj
		Scanner input = new Scanner(System.in); 
		
		//Out the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text
		/*
		 * int value = input.nextInt();
		 * double value = input.nextDouble();
		 */
		String line = input.nextLine();
		
		System.out.println("You entered:"+ line);
	}

}
