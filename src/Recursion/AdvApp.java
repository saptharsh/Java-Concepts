package Recursion;

public class AdvApp {

	
	private static int calculate(int value) {
		
		System.out.println(value);
		
		if(value == 1) {
			return 1;
		}
		
		return calculate(value - 1) * value;
	}
	
	
	public static void main(String[] args) {

		
		// Eg: 4! (4 factorial) => 4*3*2*1
		int result = calculate(4);
		
		System.out.println("Result: "+ result);
	}

}
