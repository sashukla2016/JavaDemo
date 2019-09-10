package dateTimeExample;

import java.time.Duration;
import java.time.LocalDateTime;

public class PeriodDurationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime ldt1=LocalDateTime.now();
		
		Duration d=Duration.ofHours(5);
		
		LocalDateTime ldt2=ldt1.plus(d);
		
		Duration gap=Duration.between(ldt1, ldt2);
		System.out.println("GAP IS "+gap);
	}

}
