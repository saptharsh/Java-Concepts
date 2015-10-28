package MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

	public static void main(String[] args) {

		Test test = new Test();

		// Java 7
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		*/
		
		/*
		try {
			test.run();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {
		
			//e.printStackTrace();
			System.out.println("Couldn't parse the given command.");
		}
		*/
		
		/*
		 * This can catch any kind of exception. Exception is the parent class of all exceptions
		 */
		try {
			test.run();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		/* EXAMS and Interviews:
		 * Child class exception will be first caught. Hence, FileNotFoundException should appear first,
		 * 		as is is the subclass of IO exception.
		 * Furthermore, we would get a compilation error if we try to catch IOException first
		 * 		{Saying, unreachable catch block. Due to Polymorphism}
		 */
		try {
			test.setup();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		/* try multi-catch for the above case */
		try {
			test.setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}





