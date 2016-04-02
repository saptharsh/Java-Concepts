package Multi_Dimem_array;

public class App {

	public static void main(String[] args) {
		
		int[] values = {23, 56, 67};
		System.out.println("A single value from array: "+ values[2]);
		
		/*
		 * Start number rows an columns from 0
		 */
		int[][] grid = {
				{1, 2, 3},	
				{4, 5},
				{7, 8, 9}
		};//End to an Multi-Dimensional array 
		
		System.out.println("start of the multi dimen array:"+ " "+ grid[0][0]+" "+"End:"+" "+grid[2][2]);
		
		/*
		 * 2 dimensional array of strings
		 */
		
		String[][] texts = new String[2][3];// 2 rows, 3 columns
		
		System.out.println(texts[0][1]);//null
		
		texts[0][1] = "Hello Sappy";// Zero'th row and 1st column {General Sense, 1st row, 2nd column}
		texts[1][2] = "Hello ravi";// First row and 2nd column {General Sense, 2ns row, 3rd column}
		System.out.println(texts[0][1]);
		
		
		for(int row = 0; row<grid.length; row++){
			for(int col = 0; col<grid[row].length; col++){
				System.out.print(grid[row][col]+"\t");// space between the strings
			}
			//space after each row
			System.out.println();
		}
		
		
		String[][] words = new String[2][];//the 2 rows => null, since columns are not set
		System.out.println("rows: "+words[0]);
		//Set the columns of each row individually
		
		words[0] = new String[3];// First row has 3 columns
		words[0][1] = "Middle";
		words[1] = new String[2];// Second row has 2 column
		words[1][1] = "last";
		
		for(int row = 0; row<words.length; row++){
			for(int col = 0; col<words[row].length; col++){
				System.out.print(words[row][col]+"\t");// space between the strings
			}
			//space after each row
			System.out.println();
		}
		
	}

}
