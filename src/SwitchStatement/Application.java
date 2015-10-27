package SwitchStatement;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/*
		 * Cntrl + shift + 0; to add the imports
		 * Cntrl + shift + F; to format the codead
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		// case must have constant values
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine Stopped!");
			break;

		default:
			System.out.println("Command not recognized");
		}
	}

}
