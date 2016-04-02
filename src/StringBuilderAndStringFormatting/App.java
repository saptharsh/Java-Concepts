package StringBuilderAndStringFormatting;

public class App {

	
	public static void main(String[] args){
		
		//inefficient
		String info = "";
		
		/*
		 * This below thing is quite inefficient in JAVA. Because, in Java, the strings are immutable
		 */
		//We have again created new 3 strings below
		info += "My name is Sappy.";
		info += " ";
		info += "I am Web Developer.";
		
		System.out.println(info);
		
		//efficient
		StringBuilder sb = new StringBuilder("");
		
		//We are not creating 3 new strings below, we are just appending to the String "sb." => Efficient 
		sb.append("My name is Hegde.");
		sb.append(" ");
		sb.append("I am a gowda!");
		
		System.out.println(sb.toString());
		
		//shortcut => method chaining
		StringBuilder s = new StringBuilder();
		
		s.append("My name is ravi.").append(" ").append("I am an engineer!");
		
		System.out.println(s.toString());
		
		/*
		 * StringBuffer => Thread safe version of => StringBuilder
		 * StringBuilder is lightWeight since it is not Thread safe
		 */
		
		//Formatting
		System.out.print("Here is some text.\tThat was a Tab.\nThis is a new line.");
		System.out.println(" More Text!");
		
		/*
		 * printf(Print format), formatting gives us more control than concatenation.
		 * %d => Is a self contained formatting character
		 */
		System.out.printf("Total cost %d; quantity is %d\n", 120, 5);
		
		//10 characters wide => width
		System.out.printf("Total cost %d; quantity is %10d\n", 120, 5);
		
		System.out.printf("Total cost %d; quantity is %-10d :\n", 120, 5);
		
		for(int i=0; i <4; i++) {
			
			//aligned => formatted, formatting integers
			System.out.printf("%2d: some sample text\n", i);
		}
		
		for(int i=0; i <4; i++) {
			
			//aligned => formatted, left aligned
			System.out.printf("%-2d: %s\n", i, "some sample text");
		}
		
		
		//Formatting floating point values 
		System.out.printf("First Total value: %f\n", 5.6);
		
		System.out.printf("Total value: %.2f\n", 5.639475945);

		System.out.printf("Total value: %7.2f\n", 532.639475945);
		System.out.printf("Total value: %1.2f\n", 532.639475945);
		System.out.printf("Total value: %8.2f\n", 532.639475945);
		
	}
	
}







