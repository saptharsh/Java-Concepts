package Encapsulation;

/*
 * Encapsulation Definition: (Hiding implementation details inside the class)
 * 		The Idea behind encapsulation is, to encapsulate the inner working of that class, within the Class.
 * 		In other words, we are stopping people from outside the class to use it. But, we expose certain public APIs to 
 * 		certain methods, for people to use that outside the Class
 */
class Plant{

	// People outside the class can't change this member variable {Locking}
	public static final int ID = 7;
	
	private String name;

	public String getData(){
		
		String data = "Rate: " + calculateGrowthForecast();
		return data;
	}
	
	// Try keeping all the things Private, except few which has to be exposed outside with a Public method
	private int calculateGrowthForecast() {
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}

public class App {

	
	public static void main(String[] args){
		
	}
}
