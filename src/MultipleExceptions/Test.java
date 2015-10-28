package MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

	public void run() throws IOException, ParseException {
		/* 
		 * We can only throw one exception at a time
		 */
		//throw new IOException();
		
		throw new ParseException("Error in command list.", 2);
	}
	
	public void setup() throws IOException, FileNotFoundException{
		
	}
}
