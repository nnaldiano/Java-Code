package model;

public class Lease {
	private Renter renter;
	private Property property;
	private int leaseTerm;
	private String apartmentNumber;

	
	
	public Lease() {
		super();
	}



	public Renter getRenter() {
		return renter;
	}



	public void setRenter(Renter renter) {
		this.renter = renter;
	}



	public Property getProperty() {
		return property;
	}



	public void setProperty(Property property) {
		this.property = property;
	}



	public int getLeaseTerm() {
		return leaseTerm;
	}



	public void setLeaseTerm(int leaseTerm) {
		this.leaseTerm = leaseTerm;
	}



	public String getApartmentNumber() {
		return apartmentNumber;
	}



	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	
	
	
}
