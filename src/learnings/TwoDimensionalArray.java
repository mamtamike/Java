package learnings;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
	    int[][] array = {{2,3,5},{6,8,9}};
	  //  System.out.println(myMultiDimeArray1[0][1]);
	    
	    for(int i=0; i<array.length; i++) //iterate through row
	    {
	    	for(int j=0;j<array[i].length;j++) { //iterate through coloumn
	    		System.out.print(array[i][j]+" ");
	    		
	    }
	    	 System.out.println(" ");
	    }
	   
	}

}

