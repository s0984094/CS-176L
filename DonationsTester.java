package edu.monmouth.cs176l.donations;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Would you like to process donations now? "
				+ "(enter 'Yes' to continue): ");
		
		String consoleCommand = inputScanner.nextLine();
		if (consoleCommand.equals("Yes")|| consoleCommand.equals("yes") ||
				consoleCommand.equals("YES")) {
////////////////////"Yes" was entered into the console///////////////////////////
			Donations giveToMe = new Donations(); 		//giveToMe object created
			File donerList = new File("Donations.txt");
			Scanner fileScanner = new Scanner(donerList);
			String cat = "";
			double donation = 0;
			
			String fileLine =fileScanner.nextLine();
			while (!fileLine.equals("<EOF>")) { //while loop continues until scanner reads <EOF>
				if (fileLine.startsWith("<ind")) {
				cat = "individual";
				}
				else if (fileLine.startsWith("<bus")){
				cat = "business";
				}
				else {
				cat = "other";
				}
			
			String strDonation = fileLine.replaceAll("[^0-9]", "");
			donation = Double.parseDouble(strDonation);
			// the if statement below searches the String fileLine for a negative sign
			if(fileLine.contains("-")) 
			{
				donation = donation* -1;
				 
			}
			giveToMe.processDonation(cat,donation);
			//System.out.println(donation); // TESTER
			//System.out.println(cat); // TESTER
			
			fileLine = fileScanner.nextLine();// tells scanner to advance to nextLine for while loop
			}

			fileScanner.close();
			giveToMe.getStatistics();
		} //  BRACKET IS FOR MAIN IF STATEMENT 
//////////////////////anything other than "Yes" was entered into the console:///////////////////
		else {
			System.out.println("Ending now without processing donations");}
			inputScanner.close();
			
	} 
}
