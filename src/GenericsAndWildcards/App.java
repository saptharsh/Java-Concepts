package GenericsAndWildcards;

import java.util.ArrayList;

// Note: By default, every class extends the Object class
class Machine{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void Start(){
		System.out.println("Machine Starting..");
	}
	
}

class Camera extends Machine{
	
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void start(){
		System.out.println("Sapped");
	}
}

public class App {

	public static void showList(ArrayList<String> ls) {
		
		for(String value: ls){
			System.out.println(value);
		}
	}
	
	// ? => Wildcard
	public static void showMachineList(ArrayList<?> machs){
		
		// Object is ultimate Parent of all classes in Java. Hence any kind of Objects are possible 
		for(Object value: machs){
			System.out.println(value);
		}
	}

	// ? => Wildcard
	/* Passed object could be Machine or sub type of Machine */
	public static void showLists(ArrayList<? extends Machine> machs){
		
		// Object is ultimate Parent of all classes in Java. Hence any kind of Objects are possible 
		for(Machine value: machs){
			System.out.println("expected parameter list extends Machine Class: "+value);
			value.Start();
		}
	}	
	
	// ? => Wildcard
	/* Passed Object can be Camera or Super Class of Camera Class */
	public static void showLists1(ArrayList<? super Camera> machs){
			
		// Object is ultimate Parent of all classes in Java. Hence any kind of Objects are possible 
		for(Object value: machs){
			System.out.println("expected parameter list can be Camera or Super Class of Camera Class: "+value);
			
			// We can't call Camera / Machine methods here
			//value.Start();
			/* Even this calls Machine's start() */
			((Camera) value).Start();
		}
	}
	
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("one");
		list.add("two");
		
		showList(list);
		
		ArrayList<Machine> machinesList = new ArrayList<Machine>();
		
		machinesList.add(new Machine());
		machinesList.add(new Machine());
		
		showMachineList(machinesList);
		showLists(machinesList);
		
		
		ArrayList<Camera> machinesList1 = new ArrayList<Camera>();
		
		machinesList1.add(new Camera());
		machinesList1.add(new Camera());
		
		showMachineList(machinesList1);
		showLists(machinesList1);
		
		
		System.out.println("Java doesn't know what kind of object is extended Machine Class, hence it calls methods"
				+ " only specific to Machine Class");
		
		showLists1(machinesList1);
	}

}
