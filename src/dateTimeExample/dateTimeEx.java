package dateTimeExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeEx {
	void dtOps() {
		LocalDate ld=LocalDate.now();
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ld+"\n"+ldt);
		
		//formatter
		//hh - 12 hour format and HH - 24 hour format
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String dtfe=ldt.format(dtf);
		
		System.out.println("format changed "+dtfe);
		
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ld.getMonth());
		System.out.println(ldt.getYear());
		
		System.out.println(ldt.getSecond());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		
		
		//Print any date
		
		LocalDateTime any=LocalDateTime.of(1994, 02, 12, 9, 43);
		System.out.println(any.format(dtf));
		
		LocalDateTime any2 = ldt.withYear(2016).withDayOfMonth(12);
		System.out.println(any2.format(dtf));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dateTimeEx obj=new dateTimeEx();
		obj.dtOps();

	}

}
