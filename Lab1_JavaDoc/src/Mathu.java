import java.util.*;
import java.time.LocalDate; 
import java.time.temporal.ChronoUnit; 
/**
 * This program outputs remaining weeks till 
 * end of course if student number is even and
 * prints remaining months in 2022 if student number is odd.
 * 
 * <pre>Class: CST8284</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Sept 7, 2022</pre>
 * 
 * @author Mathunan Vasanthan
 * @version 11.0.15
 * @since 1.8.0_342
 */
public class Mathu {
	public static void main(String[] args) {
		String name;
		int number = 2;
		String reason1 ,reason2;
		
		Scanner input = new Scanner(System.in);
		Date d = new Date();
		
		LocalDate date1 = LocalDate.now(); 
		LocalDate date2 = LocalDate.of(2024, 6, 30); 

		
		System.out.println("Enter Student number :");
		number = input.nextInt();
		
		
		if((number % 2 )== 1) {
			long diffWeek = ChronoUnit.WEEKS.between(date1, date2);
			
			System.out.println(diffWeek - 1);
		}else {
			long diffMonth = ChronoUnit.MONTHS.between(date1, date2);
			System.out.println(diffMonth + 1);
		}
		
	}

}