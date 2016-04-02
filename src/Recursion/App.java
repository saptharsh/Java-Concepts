package Recursion;

public class App {

	private static void calculate(int val){
		
		System.out.println(val);
		
		// Leads to StackOverflow Error
		// calculate(val);
		
		// Leads to StackOverflow Error
		// calculate(val - 1);
		
		if(val == 1){
			return;
		}
		
		calculate(val - 1);
	}
	
	
	public static void main(String[] args) {

		int value = 4;
		
		calculate(value);
	}

}
