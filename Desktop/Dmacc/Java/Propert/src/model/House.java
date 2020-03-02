package model;

public class House extends Unit {
	public House(String address, int numOfFloors, boolean hasADAccess, double monthlyRent, int bedrooms,
			double bathrooms, boolean isPetFriendly) {
		super(address, numOfFloors, hasADAccess, monthlyRent, bedrooms, bathrooms, isPetFriendly);
		// TODO Auto-generated constructor stub
	}

	private boolean hasYard;

	public boolean isHasYard() {
		return hasYard;
	}

	public void setHasYard(boolean hasYard) {
		this.hasYard = hasYard;
	}
	

}
