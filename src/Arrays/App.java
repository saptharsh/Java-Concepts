package Arrays;

public class App {

	public static void main(String[] args) {
		
		int value = 7;
		/*
		 * int[] values;
		 * values = new int[3]; 
		 */
		
		int[] values = new int[3];
		/*
		 * System.out.println(values[0]);//Prints '0' 
		 */
		
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		for(int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
		int[] numbers = {1,2,3};
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]);
			System.out.print(",");
		}
		
	}

}
