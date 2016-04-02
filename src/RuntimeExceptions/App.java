package RuntimeExceptions;

/* Checked exceptions scenarios are explained in the HandlingExceptions package */
public class App {

	public static void main(String[] args) {

		// Checked Exceptions
		/*
		try {
			Thread.sleep(111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		// Runtime Exception, we get java.lang.ArithmeticException. Child class of Run-Time exception
		/*
		int value = 7;
		value = value/0;
		*/
		
		// Null pointer exception
		/*
		String text = null;
		
		System.out.println(text.length());
		*/
		
		// Array out of bound Exception
		String[] texts = {"one","two","three"};
		
		try {
		
			System.out.println(texts[3]);
		} catch (Exception e) {

			System.out.println("First "+e.toString());
		}
		
		// More Specific handling
		/*
		 * Less commonly used
		 */
		// Case 1
		try {
			
			System.out.println(texts[3]);
		} catch (RuntimeException e) {

			System.out.println("Second "+e.toString());
		}
		
		// Case 2
		try {
			
			System.out.println(texts[3]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Third "+e.toString());
		}
		
	}

}



