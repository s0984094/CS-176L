
import org.jsoup.nodes.Document;
public class Player {
	
	
	private String idString;
	private String name;
	private double warNum;
	
	public Player(Document season, String id){
		this.idString = season.getElementById(id).text();
		this.setWar(idString);
		this.setName(idString);
		
	}
	
	public void setWar(String idString) {
		int n = idString.length();
		StringBuilder sb = new StringBuilder();
			char c1= idString.charAt(n-4);
			char c2 = idString.charAt(n-3);
			char c3 = idString.charAt(n-2);
			char c4 = idString.charAt(n-1);
		
			sb.append(c1);
			sb.append(c2);
			sb.append(c3);
			sb.append(c4);
			sb.trimToSize();
			String war = sb.toString();
			warNum = Double.parseDouble(war);
	}
	
	public void setName(String idString) {
		StringBuilder writeName = new StringBuilder();
		String[] playerSplit = idString.split(" ");
		writeName.append(playerSplit[1]);
		writeName.append(" ");
		writeName.append(playerSplit[2]);
		if(playerSplit[3].contentEquals("Jr.")) {
			writeName.append(" ");
			writeName.append(playerSplit[3]);
		}
		name = writeName.toString();
	}
	
	public double getWarNum() {
		return warNum;
	}
	public String getName() {
		return name;
	}
	
	
}
