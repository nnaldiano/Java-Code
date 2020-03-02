import java.util.ArrayList;
public class Roster {
	private String teamName;
	private ArrayList<Player> teamList;
	
	public Roster(String teamName) {
		this.teamName = teamName;
		this.teamList = new ArrayList<Player>();
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void addToTeam(Player p) {
		teamList.add(p);
	}
	
	public String displayRoster() {
		StringBuilder completeRoster = new StringBuilder(teamName + "\n");
		for(Player players : teamList) {
			completeRoster.append(players + "\n");
		}
		return completeRoster.toString();
	}

	@Override
	public String toString() {
		return "Roster [teamName=" + teamName + ", teamList=" + teamList + "]";
	}
	
	
		
		
	
}
