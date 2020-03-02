import java.time.LocalDate;
import java.time.Month;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee oliver = new Employee("1QAZXSW3", "Oliver", "Jones", "oli@bkdjs.com", LocalDate.of(2002, Month.APRIL, 7));
				
		System.out.println(oliver.toString());
		
	}

}
