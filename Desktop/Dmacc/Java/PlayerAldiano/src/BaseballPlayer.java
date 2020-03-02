
public class BaseballPlayer extends Player {
	private double battingAverage;
	
	public BaseballPlayer() {
		super();
	}
	
	public BaseballPlayer(int playerNumber, String participant, String position, double battingAverage) {
		super(playerNumber, participant, position);
		this.battingAverage = battingAverage;

	}

	public double getBattingAverage() {
		return battingAverage;
	}

	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}
	
	public String formatPlayerinformation() {
		return super.toString() + ", " + battingAverage;	
	}
	
	public String toString() {
		return "BaseballPlayer [battingAverage=" + battingAverage + "]";
	}


}
