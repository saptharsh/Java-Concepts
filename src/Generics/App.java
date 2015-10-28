package Generics;
// We mostly use generics with ArrayLists

import java.util.ArrayList;
import java.util.HashMap;


class Animal{
	
}

public class App {

	public static void main(String[] args) {

		///////////////// Before Java 5 ////////////////////
		ArrayList list = new ArrayList();

		list.add("Apply");
		list.add("Banana");
		list.add("Orange");
		
		// Retrieving values from the list
		String fruit = (String)list.get(1);
		
		System.out.println("Fruit in index 1: "+fruit);
		
		
		///////////////// now in practice ///////////////////
		/* ArrayList is parameterized Generic Class */
		ArrayList<String> newList = new ArrayList<String>();
		
		newList.add("cat");
		newList.add("dog");
		newList.add("aligator");
		
		// Retrieving values from the list
		String animal = newList.get(0);
		System.out.println("Animal at index 0: "+animal);
		
		
		////////// There can be more than one type argument ///////////
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		
		////////// Java 7 Style /////////////////////////
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
	}

}
