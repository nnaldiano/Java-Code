
public class BasketballPlayer extends Player {
	private double freeThrowPercentage;

	public BasketballPlayer() {
		super();
	}
	public BasketballPlayer(int playerNumber, String participant, String position, double freeThrowPercentage) {
		super(playerNumber, participant, position );
		this.freeThrowPercentage = freeThrowPercentage;
	}
	
	public double getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}
	
	public String formatPlayerinformation() {
		return super.toString() + ", " + freeThrowPercentage;
	}
	public String toString() { 
		return "BasketballPlayer [freeThrowPercentage=" + freeThrowPercentage + "]";
	}
	

}
