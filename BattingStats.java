import java.io.IOException;
import java.io.InvalidObjectException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.StringTokenizer;

public class BattingStats {


	public static void main(String[] args) throws IOException {
		Document battingStats2022;
		Document battingStats2021;
		Document battingStats2020;
		Document battingStats2020thu2022;
		

/////////////////////TOP BATTING STATS FOR 2022////////////////////////////////////////
System.out.println("Top 10 Batters for 2022 Season");

		
		battingStats2022 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0").get();
		Elements table2022 = battingStats2022.select("table.rgMasterTable");
		Elements tbody2022 =table2022.select("tbody") ;
		Elements tr2022 = tbody2022.select("tr");
		String players2022 = tr2022.select("td.grid_line_regular a").text();
			//System.out.println(players2022);
			
			String[] playerArray22 = players2022.split(" ", 0);
		
				for(int i =0; i<playerArray22.length;i=i+3) {
					System.out.println(playerArray22[i]+ " " + playerArray22[i+1]);
				}

	
			
///////////////////TOP BATTING STATS FOR 2021 ///////////////////////////////////////
		System.out.println("Top 10 Batters for 2021 Season");
			
		String topBatters2021[];
		topBatters2021 = new String[10];
		
		battingStats2021 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0").get();
		Elements table2021 = battingStats2021.select("table.rgMasterTable");
		Elements tbody2021 =table2021.select("tbody") ;
		Elements tr2021 = tbody2021.select("tr");
		String players2021 = tr2021.select("td.grid_line_regular a").text();
			//System.out.println(players2021);
			
			String[] playerArray21 = players2021.split(" ", 0);
			
			//for loop that takes stats from the top10 Batters from the 30 players in the player array.
			for(int i =0; i<playerArray21.length;i=i+3) {
				System.out.println(playerArray21[i]+ " " + playerArray21[i+1]);
			}

			
			
///////////////////TOP BATTING STATS FOR 2020 ///////////////////////////////////////
		String topBatters2020[];
		topBatters2020 = new String[10];	
			
		battingStats2020 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0").get();
		Elements table2020 = battingStats2020.select("table.rgMasterTable");
		Elements tbody2020 =table2020.select("tbody") ;
		Elements tr2020 = tbody2020.select("tr");
		String players2020 = tr2020.select("td.grid_line_regular").text();
			System.out.println(players2020); 
			

		

		
				
	}

	
}
