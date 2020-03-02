package cards;
import java.time.LocalDate;

public class DriverLicense extends Card{
	private String DLNumber;
	private LocalDate expirationDate;
	public DriverLicense() {
		super();
	}
	public DriverLicense(String name, String DLNumber, LocalDate expirationDate) {
		super(name);
		this.DLNumber = DLNumber;
		this.expirationDate = expirationDate;
	}
	public String getDLNumber() {
		return DLNumber;
	}
	public void setDLNumber(String dLNumber) {
		DLNumber = dLNumber;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String format() {
		return super.format() + ", DL Number: " + DLNumber + ", Expiration Date: " + expirationDate;
	}	
}
