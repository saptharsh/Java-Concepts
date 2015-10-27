package Interfaces;

//A class can have any number of interfaces
public class Person implements Info{

	private String name;
	
	/*
	 * To generate constructor with the help of eclipse
	 * right click -> source -> Generate Constructor using fields
	 */

	public Person(String name) {

		this.name = name;
	}
	
	
	public void greet(){
		System.out.println("Hello there!");
	}


	public void showInfo() {
		
		System.out.println("Person's name is "+ name); 
		
	}
	
}
