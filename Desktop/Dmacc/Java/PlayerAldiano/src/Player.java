// Noah Aldiano
public class Player {
	private int PlayerNumber;
	private String Participant;
	private String Position;
	
	public Player() {
		PlayerNumber = 0;
		Participant = "";
		Position = "";
	}
	
	public Player(int playerNumber, String participant, String position) {
		super();
		PlayerNumber = playerNumber;
		Participant = participant;
		Position = position;
	}





	public int getPlayerNumber() {
		return PlayerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		PlayerNumber = playerNumber;
	}
	public String getParticipant() {
		return Participant;
	}
	public void setParticipant(String participant) {
		Participant = participant;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	@Override
	public String toString() {
		return "#" + PlayerNumber + " : " + Participant + ", " + Position;
	}
}
