import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Get all inputs
		System.out.print("Enter cost per Square Foot: ");
		double costSqft = sc.nextDouble();
		
		System.out.print("Enter house base in feet: ");
		double houseWidth = sc.nextDouble();
		
		System.out.print("Enter height from base of the wall to the base of the roof: ");
		double wallHeight = sc.nextDouble();
		
		System.out.print("Enter height from the base of the wall to the peak of the roof: ");
		double peakHeight = sc.nextDouble();
		
		System.out.print("Enter the number of windows: ");
		double totalWindows = sc.nextDouble();
		
		System.out.print("Enter the height of the windows: ");
		double windowHeight = sc.nextDouble();
		
		System.out.print("Enter the width of the windows:");
		double windowWidth = sc.nextDouble();
		
		System.out.print("Enter the number of doors: ");
		double totalDoors = sc.nextDouble();
		
		System.out.print("Enter the height of the doors: ");
		double doorHeight = sc.nextDouble();
		
		System.out.print("Enter the width of the doors: ");
		double doorWidth = sc.nextDouble();
		
		
		//Do Calculations
		
		//Obtaining area of walls without windows and doors 
		//Next line determines the sq footage of a short wall
		double wallArea =  houseWidth*wallHeight;
		//Next two lines determines the area of the triangular section of the taller walls  
		double roofHeight = peakHeight-wallHeight;
		double triArea = 0.5*houseWidth*roofHeight;
		//Next line determines total surface area(paintable and not paintable)
		double totalSurfaceArea = (triArea*2) + (wallArea*4);
		
		//remove non paintable areas from walls that are occupied by windows and doors
		double nonPaintable= (windowHeight*windowWidth)*totalWindows + totalDoors*(doorHeight*doorWidth);
		
		//calculate total paintable surface area
		double paintableSurfaceArea = totalSurfaceArea - nonPaintable;
		
		//calculating the cost
		double totalCost = costSqft*paintableSurfaceArea; 
		sc.close();
		
		
	
		
		
		//Output results
		System.out.print("Your total paintable surface area is " + paintableSurfaceArea + "Square feet");
		System.out.print("Your estimated cost is $"+ totalCost);
		
	}

}
