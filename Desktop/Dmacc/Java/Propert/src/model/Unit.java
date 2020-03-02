package model;

public class Unit extends Property{
	private double monthlyRent;
	private int bedrooms;
	private double bathroom;
	private boolean isPetfriendly;
	
	
	
	
	public Unit(String address, int numOfFloors, boolean hasADAccess, double monthlyRent, int bedrooms, double bathrooms, boolean isPetFriendly) {
		super(address, numOfFloors, hasADAccess);
		this.monthlyRent = monthlyRent;
		this.bedrooms = bedrooms;
		this.bathroom = bathrooms;
		this.isPetfriendly = isPetFriendly;
	}
	
	
	
	public double getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public double getBathroom() {
		return bathroom;
	}
	public void setBathroom(double bathroom) {
		this.bathroom = bathroom;
	}
	public boolean isPetfriendly() {
		return isPetfriendly;
	}
	public void setPetfriendly(boolean isPetfriendly) {
		this.isPetfriendly = isPetfriendly;
	}
}
