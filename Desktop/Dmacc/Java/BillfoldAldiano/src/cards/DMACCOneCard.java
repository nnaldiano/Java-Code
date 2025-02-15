package cards;
public class DMACCOneCard extends Card {
	/*class subclass extends superclass
	 * this basically means that the subclass (DMACCOneCard) inherits the methods 
	 * from the superclass (Card) 
	 */
	private String IDnumber;
	 
	public DMACCOneCard() {
		super();
	}
	public DMACCOneCard(String name, String id) {
		super(name);
		setIDnumber(id);
	}
	public String getIDnumber() {
		return IDnumber;
	}
	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	public String format() {
		return super.format() + ", ID: " + IDnumber;
	}
}
