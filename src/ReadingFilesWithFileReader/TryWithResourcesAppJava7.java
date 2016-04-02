package ReadingFilesWithFileReader;

// lecture 43, JAVA 7 feature
class Temp implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("Closing");
		
	}
	
}

class Temp1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		System.out.println("Another way of cloasing");
		
		//throw new Exception("Oh no!");
	}
	
}

public class TryWithResourcesAppJava7 {

	public static void main(String[] args) {

		Temp temp = new Temp();
		
		try {
			temp.close();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		try(Temp1 temp1 = new Temp1()) {
			
			// The close is automatically called
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		

	}

}
