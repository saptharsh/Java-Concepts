package Interfaces;


public class App {

	private static void outputInfo(Info param){
		param.showInfo();
	}
	
	public static void main(String[] args) {
		
		RobotMachine mach1 = new RobotMachine();
		mach1.start();
		
		Person person1 = new Person("sappy bahadur");
		person1.greet();
		
		
		Info info1 = new RobotMachine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println();
		System.out.println("Calling Object methods using static methods: ");
		
		outputInfo(mach1);
		outputInfo(person1);
		
	}

}
