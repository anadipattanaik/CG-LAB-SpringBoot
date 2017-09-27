import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataTime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		
		int hh = time.getHour();
		int mi = time.getMinute();
		int ss = time.getSecond();
		int nn = time.getNano();
		
		System.out.println(dd+":"+mm+":"+yy+":"+hh+":"+mi+":"+ss+":"+nn);
		
		LocalDateTime ldt= LocalDateTime.of(1984,03,16,22,50,00);
		System.out.println(ldt);
		System.out.println(ldt.plusYears(33));
		System.out.println(ldt.minusYears(31));
		System.out.println(ldt.plusYears(33).compareTo(ldt.minusYears(31)));
		
		ZoneId zid = ZoneId.systemDefault();
		System.out.println(zid);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		
		
	}

}
