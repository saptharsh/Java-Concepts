package SettersAndThis;

class Frog{
	
	private String name;
	private int age;
	private String collage;
	
	
	public void setName(String Newname){
		name = Newname;
	}
	
	public void setAge(int NewAge){
		age = NewAge;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	/*
	 * usage of this variable
	 */
	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}
	
	/*
	 * Different way of setting the class variables
	 */
	public void setInfo(String name, int age){
		setName(name);
		setAge(age);
	}
	
}

public class App {

	public static void main(String[] args) {

		Frog frog1 = new Frog();
		Frog frog2 = new Frog();
		/*
		 * If we make the name and age variables of Frog class as 'private', then we can't access those variable using class instances 
		 */
		//frog1.name = "Tippe";/* Setting an instance var with equals sign */
		//frog1.age = 23;
		
		/*
		 * This is called, Encapsulating the Data. Hiding the variables
		 */
		frog1.setName("pradeep");
		frog1.setAge(23);
		frog1.setCollage("sharada");
		
		System.out.println(frog1.getName()+ "'s age is " + frog1.getAge() + ". Studied in " + frog1.getCollage());
		
		frog2.setName("sappy");
		frog2.setAge(23);
		
		System.out.println("New frog's name is " + frog2.getName() + " of age " + frog2.getAge());

	}

}



