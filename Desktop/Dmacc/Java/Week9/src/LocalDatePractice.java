import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
public class LocalDatePractice {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2000, 2, 26);
		
		Period p = Period.between(birthday, today);
		long p2 = ChronoUnit.DAYS.between(birthday,today);
		
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old.");
		System.out.println("You are " + p2 + " days old.");
		
	}

}
