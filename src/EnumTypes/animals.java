package EnumTypes;

public enum animals {
	
	// These are objects of the Type animals. These are Enum constants
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	
	String name;
	
	// Constructor
	animals(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		
		return "This animal is called: "+ name;
	}
}
