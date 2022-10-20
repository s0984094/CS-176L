package edu.monmouth.cs176l.donations;

public class Donations {
	private int numIndividual = 0;
	private double amtIndividual = 0;
	private int numBusiness = 0;
	private double amtBusiness = 0; 
	private int numOther = 0;
	private double amtOther = 0;
	

	public void processDonation(String cat, double donation) {
		if (cat.equals("individual")) {
			amtIndividual = amtIndividual + donation;
			if (donation >0) {
			numIndividual = numIndividual + 1;
			}
			else {
			numIndividual = numIndividual -1; 	
			}
		}
		else if(cat.equals("business")) {
			amtBusiness = amtBusiness + donation;
			if (donation > 0) {
			numBusiness = numBusiness + 1;
			}
			else {
			numBusiness = numBusiness - 1;
			}
		}
		else  {
			amtOther = amtOther + donation;
			if (donation > 0) {
			numOther = numOther +1;
			}
			else {
			numOther=numOther-1;
			}
			
		}
		
	}
	public void getStatistics() {
		System.out.printf("Individual: #:%d%n",numIndividual, " $",amtIndividual, "\n",
				"Business: #%d%n:",numBusiness , " $",amtBusiness, "\n",
				"Other: #:",numOther, " $", amtOther);
		
	}
}
