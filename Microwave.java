public class Microwave {
	
private int time ;
private int power = 1;
	
	public void time() //This method serves as the +30 second time button
	{  time = time + 30;
	System.out.println("Time Button was pressed. Time is " + time + " seconds");
	}
	
	public void power() //Increases power level in increments of 1
	{
	power = power +1;
	System.out.println("Power Button was pressed. Power level is " + power);
	}
	
	public void start() //Getter method that displays time and power level 
	{
		System.out.println("Cooking for " +time+ " seconds at level " + power);
	}
	//reset button that returns power to 1, and time to 0
	public void reset() 
	{
	time = 0; 	
	power = 1;
	System.out.println("Reset Button was pressed. Power level is " +power+ ". Time is "+ time+" Seconds.");
	}
}
