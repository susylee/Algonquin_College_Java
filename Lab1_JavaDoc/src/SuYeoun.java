
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * This program outputs remaining weeks till 
 * end of course if student number is even and
 * prints remaining months in 2022 if student number is odd.
 * 
 * <pre>Class: CST8284</pre>
 * <pre>Professor: Fedor Ilitchev</pre>
 * <pre>Sept 7, 2022</pre>
 * 
 * @author Su Yeoun Lee
 * @version 11.0.16
 * @since 1.8.0_342
 */
public class SuYeoun {
 
	
	
	/**
	 * main method
	 * @param args arguments from command line 
	 */
	
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		//		System.out.println( cal.get(Calendar.YEAR));
		//		System.out.println( cal.get(Calendar.MONTH)+1);
		//		System.out.println( cal.get(Calendar.DATE));
		//System.out.println(cal.getWeeksInWeekYear()-1);  //52 weeks in 2022
		
		LocalDate startDate = LocalDate.of(2022, 9, 14); 
		LocalDate endDate = LocalDate.of(2024, 6, 30); 
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = input.nextLine();
		System.out.println("What is your student number? ");
		int stuNum = input.nextInt();

		System.out.println("Why are you taking this course? (2 reasons)");
		for(int i=0; i<2; i++) {
			System.out.print(i+1 + ":");
			String reason1 = input.nextLine();
			String reason2 = input.next();
		}

		if(stuNum%2==1) { //odd number
			//the remaining weeks till the end of your program and subtract 1 from the result.
			long remainingWeeks = ChronoUnit.WEEKS.between(startDate, endDate); 
			System.out.println("You have " + (remainingWeeks-1) + " wees till the end of your program.");
			
		} else { //even number
			//the number of the remaining months in the year 2022 and add 1 to the result.
			int remainingMonths = (cal.DECEMBER+1) - (cal.get(Calendar.MONTH)+1);
			System.out.println("You have still " + (remainingMonths + 1) + " months in 2022!" );
		}

	}


}
