package Model;

public class Instructor {
	private String firstName;
	private String lastName;
	private String email;
	
	public Instructor(){
	
	}
	
	public Instructor(String firstName, String lastName, String email ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Instructor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = makeEmailAddress(firstName,lastName);
	}
	

 String getFirstName() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String makeEmailAddress(String firstName, String lastName) {
		return firstName.toLowerCase().charAt(0) + lastName.toLowerCase() + "@dmacc.edu";
		
	}
	
	
	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + makeEmailAddress(firstName,lastName) + "]";
	}
}
