
public class ArrayAssignment1 {

	public static void main(String[] args) {

		double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double largestDouble = 0;
		int negatives = 0;
		for (double element : values)
		{
			if(element >largestDouble)	// if statement determines the largest double
			{
				largestDouble = element; /* if the next element in the array is larger than the 
				previous element it is assigned to the variable largestDouble*/
			}
			System.out.print( element +" ");
			if (element < 0) 
			{
			negatives ++;
			}
		}
		System.out.println("\nThere are " + negatives + " negative numbers in the array");
		System.out.println("The largest element in the array is " +largestDouble);
		
	}

}
