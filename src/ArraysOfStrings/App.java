package ArraysOfStrings;

public class App {

	public static void main(String[] args) {
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "Sappy";

		System.out.println(words[0]+ " "+ words[1]+" "+ words[2]);
		
		String[] fruits = {"Apple", "Oranges", "Bananas"};
		
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		
		/*
		 * int value = 4;// int is a premitive type since it starts with a Lower case letter
		 * String text = null;//Default value for references
		 */
		
		int value = 0;
		String text = null;//text a reference to String
		String[] texts = new String[2];//2 references of strings, texts[0 and texts[1]]
		
		System.out.println("Default value of the reference: "+ texts[0]);
		texts[0]="some String";
		System.out.println("value of the reference texts[0]:"+ texts[0]);
		
	}

}
