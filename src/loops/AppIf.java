package loops;

public class AppIf {
	
	
	public static void main(String[] args){
	int loop = 0;
	
	while(true){
		System.out.println("looping:"+ loop);
	
		if(loop==5){
			break;//breaks out of the complete program
		}
		
		loop++;
		System.out.println("looping");
	}
	
	}

}
