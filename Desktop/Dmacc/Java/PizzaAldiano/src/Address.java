//Noah Aldiano
public class Address {
	private String HouseNumber;
	private String Street;
	private String OptionalAptNumber;
	private String City;
	private String State;
	private String PostalCode;
	
	public Address(String houseNumber, String street, String city, String state, String postalCode) {
		setHouseNumber(houseNumber);
		setStreet(street);
		setCity(city);
		if(state.length() != 2 && this.State == null) {
			throw new IllegalArgumentException("State or postal code is null");
		}
		else if (state.length() == 2) {
			this.State = state;
		}
		if(postalCode.length() != 5 && this.PostalCode == null) {
			throw new IllegalArgumentException("State or postal code is null");
		} 
		else if (postalCode.length() == 5) {
			this.PostalCode = postalCode;
		}
	}
	
	public Address(String houseNumber, String street, String optionalAptNumber, String city, String state, String postalCode) {
		setHouseNumber(houseNumber);
		setStreet(street);
		setOptionalAptNumber(optionalAptNumber);
		setCity(city);
		if(state.length() != 2 && this.State == null) {
			throw new IllegalArgumentException("State or postal code is null");
		}
		else if (state.length() == 2) {
			this.State = state;
		}
		if(postalCode.length() != 5 && this.PostalCode == null) {
			throw new IllegalArgumentException("State or postal code is null");
		} 
		else if (postalCode.length() == 5) {
			this.PostalCode = postalCode;
		}	
	}
	
	public String getHouseNumber() {
		return HouseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		HouseNumber = houseNumber;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getOptionalAptNumber() {
		return OptionalAptNumber;
	}
	public void setOptionalAptNumber(String optionalAptNumber) {
		OptionalAptNumber = optionalAptNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		if(State.length() > 2) {
			
		}
		return State;
	}
	public void setState(String state) {
		
		State = state;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	
	public void print() {
		System.out.println(Street);
		System.out.printf(City, State);
		
		System.out.println("");
		System.out.println(PostalCode);
		return;
	}
	
}
