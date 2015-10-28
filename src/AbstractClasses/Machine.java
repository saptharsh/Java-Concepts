package AbstractClasses;

public abstract class Machine {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// Forcing the Child Class classes to implement certain method
	public abstract void Start();
	public abstract void doStuff();
	public abstract void ShutDown();
	
	public void run(){
		Start();
		doStuff();
		ShutDown();
	}
	
}
