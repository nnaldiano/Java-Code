package model;

public class Renter {
	private String firstName;
	private String lastName;
	
	public Renter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Renter [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
