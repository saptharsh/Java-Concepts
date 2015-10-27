package MethodParameters;

class Robot{
	
	public void speak(String str){
		System.out.println(str);
	}

	public void jump(int height){
		System.out.println("jumping " + height);
	}
	
	public void move(String dir, double dist){
		System.out.println("Moving " + dist + " metres in " + dir + " direction");
	}
	
}


public class App {
	
	public static void main(String[] args){
		
		Robot sam = new Robot();
		sam.speak("Hi, I am Sam!");
		
		sam.jump(8);
		
		sam.move("west", 12.2);
		
		String greeting = "Hello sappy!!"; /* reference for the parameters being passed */
		sam.speak(greeting);

		int value = 14;
		sam.jump(value);
		
	}

}


