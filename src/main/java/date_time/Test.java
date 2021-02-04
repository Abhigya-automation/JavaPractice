package date_time;

import java.time.*;
public class Test {
	public static void main(String[] args) {
		
		/*LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println(dd+":"+mm+":"+yy);*/
		
		LocalTime time= LocalTime.now();
		int h=time.getHour();
		int m= time.getMinute();
		int s= time.getSecond();
		
		System.out.printf("%d:%d:%d",h,m,s);
		
		
		
	}

}
