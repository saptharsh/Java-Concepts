package gettersAndReturnValues;

class Person {
	String name;
	int age;
	/*
	 * void methods can't have a return type
	 */
	void Shout(){
		System.out.println("shouting... My name is"+" "+ name);
	}
	
	int calculateYearsToRetire(){
		int yearsLeft = 65 - age;
		/*
		 * System.out.println(yearsLeft);// can't run a syso inside class 
		 */
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName(){
		return name;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 45;
		
		person1.Shout();
		
		int yearsLeft = person1.calculateYearsToRetire();
		System.out.println("Years left for retirement"+" "+yearsLeft);
		
		int age1 = person1.getAge();
		System.out.println("The age of "+person1.getName()+" is"+" "+age1);
	}

}
