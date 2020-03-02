import java.util.ArrayList;
public class LeagueTesterAldiano {

	public static void main(String[] args) {
		ArrayList<Team> teamList = new ArrayList<Team>();
		
		Team DuneRatz = new Team("Dune Ratz", 7 ,"Kadeem");
		Team WaveRippers = new Team("Wave Rippers", 7, "Vert");
		Team Scorchers = new Team("Scorchers", 7,"Kitaro");
		Team RoadBeasts = new Team("Road Beasts", 7,"Banjee");
		Team Teku = new Team("Teku", 7, "Nolo");
		Team Maniacs = new Team("Maniacs",7,"Forge");
		
		teamList.add(RoadBeasts);
		teamList.add(Scorchers);
		teamList.add(WaveRippers);
		teamList.add(DuneRatz);
		teamList.add(Teku);
		teamList.add(Maniacs);
		
		for(Team teams: teamList) {
			System.out.println(teams.TeamString());
		}
		

	}

}
