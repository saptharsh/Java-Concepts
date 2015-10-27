package AccessSpecifiers;

public class Plant {

	/* Declaring instance var as Public is a bad practice */
	
	// WE NEED TO ENCAPSULATE USING SETTERS AND GETTERS, or initialize it as Static var
	
	public String name;
	
	// Acceptable practice
	public final static int ID = 7;

	/* is only accessed within the class */
	private String type;
	
	/* is accessible by child classes, and within package, and of course in same Class*/
	protected String Size;
	
	/* package level visibility, that is, the default Access Specifier would be "Protected" */
	int height;
	
	public Plant() {
		
		this.name = "I am roosy";
		this.type = "Vascular Plant";
		this.Size = "Medium";
		this.height = 5;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
