package medals;
import java.util.*;
public class Medals {

	public static void main(String[] args) {
		String heading1 = "Country";
		String heading2 = "Gold";
		String heading3 = "Silver";
		String heading4 = "Bronze";
		String heading5 = "Total";
		String totalsRow = "Totals";

		ArrayList<String> Countries = new ArrayList<String>();
		Countries.add("Canada");
		Countries.add("Italy");
		Countries.add("Germany");
		Countries.add("Japan");
		Countries.add("Kazakhstan");
		Countries.add("Russia");
		Countries.add("South Korea");
		Countries.add("United States");
		
		ArrayList<Integer> Gold = new ArrayList<Integer>();
		Gold.add(0);
		Gold.add(0);
		Gold.add(0);
		Gold.add(1);
		Gold.add(0);
		Gold.add(3);
		Gold.add(0);
		Gold.add(1);
		
		ArrayList<Integer> Silver = new ArrayList<Integer>();
		Silver.add(3);
		Silver.add(0);
		Silver.add(0);
		Silver.add(0);
		Silver.add(0);
		Silver.add(1);
		Silver.add(1);
		Silver.add(0);

		ArrayList<Integer> Bronze = new ArrayList<Integer>();
		Bronze.add(0);
		Bronze.add(1);
		Bronze.add(1);
		Bronze.add(0);
		Bronze.add(1);
		Bronze.add(1);
		Bronze.add(0);
		Bronze.add(1);
		
		ArrayList<Integer> Total = new ArrayList<Integer>();
		Total.add(Gold.get(0)+Silver.get(0)+Bronze.get(0));
		Total.add(Gold.get(1)+Silver.get(1)+Bronze.get(1));
		Total.add(Gold.get(2)+Silver.get(2)+Bronze.get(2));
		Total.add(Gold.get(3)+Silver.get(3)+Bronze.get(3));
		Total.add(Gold.get(4)+Silver.get(4)+Bronze.get(4));
		Total.add(Gold.get(5)+Silver.get(5)+Bronze.get(5));
		Total.add(Gold.get(6)+Silver.get(6)+Bronze.get(6));
		Total.add(Gold.get(7)+Silver.get(7)+Bronze.get(7));
		
		ArrayList<ArrayList<Integer>> AllMedals = new ArrayList<ArrayList<Integer>>();
		AllMedals.add(Gold);
		AllMedals.add(Silver);
		AllMedals.add(Bronze);
		AllMedals.add(Total);
		
		
		int sumAllGold = 0;
		for(int i = 0; i < Gold.size(); i++) {
			sumAllGold = sumAllGold +Gold.get(i);
		}
		int sumAllSilver = 0;
		for(int i = 0; i<Silver.size(); i++) {
			sumAllSilver = sumAllSilver + Silver.get(i);
		}
		int sumAllBronze = 0;
		for (int i = 0; i <Bronze.size();i++) {
			sumAllBronze = sumAllBronze +Bronze.get(i);
		}
		int sumAllMedals = sumAllGold + sumAllSilver + sumAllBronze;


		System.out.printf("%15s %10s %10s %10s %10s %n",
				heading1, heading2, heading3, heading4, heading5);

		for (int i = 0; i <Countries.size(); i++) {
			System.out.printf("%15s %10s %10s %10s %10s %n", 
					Countries.get(i), AllMedals.get(0).get(i),AllMedals.get(1).get(i),
					AllMedals.get(2).get(i),AllMedals.get(3).get(i));	
	}
				
		System.out.printf("%n %14s %10s %10s %10s %10s %n", 
				totalsRow, sumAllGold, sumAllSilver, sumAllBronze, sumAllMedals);   
	}

}
