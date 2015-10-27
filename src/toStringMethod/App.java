package toStringMethod;

class Frog {
	
	//var should begin with lower case letters
	private String name;
	private int id;
	
	public Frog(String name, int id){
		setName(name);
		setId(id);
	}
	
	
	public String toString(){
		
		//Very useful in debugging
		//return String.format("%3d: %s", id, name);
		return String.format("%-3d: %s", id, name);
		
		
		/*
		 * Avoids the inefficiency of concatenating strings.
		 * Because, concatenation results in the creation of new strings
		 */
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();
		*/
		
		//return id + " : " + name;
		//return "No need to call this method specifically, as it is one of the default methods provided by object class";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 
}


//All class has object class as it ultimate parent
public class App {

	public static void main(String[] args) {

		//obj class has a set of default methods
		Object obj = new Object();
		
		//frog1 will inherit all the default methods if the object class
		Frog frog1 = new Frog("Tippe", 23);
		Frog frog2 = new Frog("Kaanta", 23);
		
		/*
		 * Calling, some of the default methods.
		 * Comment out the toString() method in the Frog class, then, we would get a unique hash code for the class
		 */
		System.out.println(frog1);
		System.out.println(frog2);
		
	}

}
