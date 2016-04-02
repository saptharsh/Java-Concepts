package EnumTypes;

public class App {

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	
	// Basic and 95 percent of the time we use Enums this way
	public static void main(String[] args) {

		int day = SUNDAY;
		
		switch (day) {
		case SUNDAY:
			System.out.println("Its Sunday!");
			break;
		case MONDAY:
			System.out.println("Its Monday");
			break;
		case TUESDAY:
			System.out.println("Its Tuesday");
			break;

		default:
			break;
		}
	}

}
