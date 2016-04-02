package InnerClasses;

// We can have as many classes as we want in this .java file. But, name of the .java file should correspond to One Public Class
public class App {

	public static void main(String[] args) {

		Robot robot = new Robot(7);
		robot.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
