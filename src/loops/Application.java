package loops;
//To Format the code shift+ctrl+F
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int initialValue = 0;

		while (initialValue < 5) {
			System.out.println("value" + initialValue);
			initialValue = initialValue + 1;
		}

		for(int i = 0; i < 5; i++){
			System.out.print("using for loop:");//prints in the line
			System.out.println("value " + i);
		}
		
		for(int i = 0; i < 5; i++){
			/*
			 * println : It prints the String, and then it goes to next line
			 */
			System.out.println("An other way of doing this: ");
			System.out.printf("the value is %d\n", i);
		}
	}

}
