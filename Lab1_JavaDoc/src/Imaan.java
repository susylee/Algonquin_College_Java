import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Imaan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String reason1, tell;
		
		System.out.println("Enter your name");
		String name= input.nextLine();
		
		System.out.println("Enter your reason1 ");
		reason1=input.nextLine();
		
		System.out.println("Enter your reason2 ");
		tell= input.nextLine();
		
		System.out.println("Enter student number ");
		int studentNumber = input.nextInt();
			
		System.out.println("Your name is "+ name);
		System.out.println("Your student number is "+ studentNumber);
		System.out.println("Reason number 1 is "+reason1);
		System.out.println("Reason number 2 is "+tell);
		
		/*
		 * LocalDate class used to compare different dates with 
		 * present date
		 */
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2024,6,30);
		LocalDate date3=LocalDate.of(2022,9,14);
		
	
		long weeks = ChronoUnit.WEEKS.between(date1, date2); 
		long remaining = ChronoUnit.MONTHS.between(date1, date3); 
		
	    /*
	     * if student number is even then remaining weeks till end 
	     * of course is shown. Else remaining months in 2022 is shown.
	     * 
	     */
		if (studentNumber%2==0) {
			System.out.println("Remaining months in this year are "+remaining);
			
		}
		else {
			System.out.println("Remaining weeks till end of course are "+(weeks-1));
			
		}
		

	}
	

}
