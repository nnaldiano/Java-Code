import java.time.LocalDate;
import java.time.Period;
public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private int extension;
	private static int lastNumberAssigned = 4001;
	
	
	public Employee(String id, String fn, String ln, String e, LocalDate hd) {
		employeeId = id;
		setFirstName(fn);
		setLastName(ln);
		setEmail(e);
		setHireDate(hd);
		
		lastNumberAssigned++;
		extension = lastNumberAssigned;
		
		if ((getFirstName() == null )||(getLastName() == null)) {
			throw new IllegalArgumentException("Object not created");
		}
		
	}

	
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName.length() > 0 ) {
			this.firstName = firstName;
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName.length() > 0) {
			this.lastName = lastName;
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public int getExtension() {
		return extension;
	}
	
	public int yearsEmployed() {
		LocalDate today = LocalDate.now();
		LocalDate hire = this.getHireDate();
		
		Period p = Period.between(hire, today);
		return p.getYears();
		}
	
	public String workAnniversary() {
		LocalDate today = LocalDate.now();
		LocalDate hire = this.getHireDate();
		
		return hire.getMonth() + " " + hire.getDayOfMonth() + ", " + today.getYear();
	}
	private LocalDate hireDate;


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", extension=" + extension + ", hireDate=" + hireDate + "]";
	}

	
	
	

}
