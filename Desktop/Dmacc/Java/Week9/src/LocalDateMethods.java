import java.time.LocalDate;

public class LocalDateMethods {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println("Today is " + today);
		System.out.println("Today is " + today.getDayOfWeek());
		System.out.println("Today is " + today.getMonthValue());
		System.out.println("Today is " + today.getYear());
		}

}
