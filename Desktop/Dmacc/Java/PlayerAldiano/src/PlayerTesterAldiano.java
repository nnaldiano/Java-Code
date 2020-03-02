
public class PlayerTesterAldiano {
	public static void main(String[] args) {
		
		BaseballPlayer baseballPlayer1 = new BaseballPlayer(24, "Willie Mays", "Center fielder", 0.123);
		BaseballPlayer baseballPlayer2 = new BaseballPlayer(1, "Babe Ruth", "Pitcher", .425);
		Roster baseball = new Roster("Random Baseball team");
		baseball.addToTeam(baseballPlayer1);
		baseball.addToTeam(baseballPlayer2);
		System.out.println(baseball.displayRoster());
		
		BasketballPlayer basketballPlayer1 = new BasketballPlayer(21, "Shaquille O'Neal", "Forward", 21);
		BasketballPlayer basketballPlayer2 = new BasketballPlayer(24,"Kobe Bryant", "Shooting Guard", 36);
		Roster basketball = new Roster("Random Basketball team");
		basketball.addToTeam(basketballPlayer1);
		basketball.addToTeam(basketballPlayer2);
		
		System.out.println(basketball.displayRoster());
		//System.out.println(basketballPlayer.formatPlayerinformation());
		//System.out.println(baseballPlayer1.formatPlayerinformation());
	}
}
