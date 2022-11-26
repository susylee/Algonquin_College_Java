import java.util.Calendar;
import java.util.Scanner;

/**
 * This is the MyHealthDataMain class for this program. 
 * This means that it just runs the application with a method main.
 * 
 * @see
 * @author Su Yeoun Lee
 */

public class MyHealthDataTest {

	public static void main(String[] args) {
		/** 
		 * main method 
		 * @param 
		 * args arguments from command line 
		 */
		
		MyHealthData patient = new MyHealthData();

		//prompt for input of the patient’s data
		Scanner input = new Scanner(System.in);
		boolean nameBoolean = false;

		while(!nameBoolean) {
			System.out.print("Enter your first and last name: ");
			String name = input.nextLine();

			try {
				String names[] = name.split(" ");	
				patient.setFirstName(names[0]);
				patient.setLastName(names[1]);

			} catch(Exception E) {
				System.out.println("Invalid input. Enter again");
				nameBoolean = false;
				if(nameBoolean == false) {
					continue;
				}
			} break;
		} //while

		System.out.print("Gender: ");
		String gender = input.next();
		patient.setGender(gender);

		System.out.print("Birth year: ");
		int birthYear = input.nextInt();
		patient.setBirthYear(birthYear);

		System.out.print("Height(inches): ");
		double height = input.nextDouble();
		patient.setHeight(height);

		System.out.print("Weight(pounds): ");
		double weight = input.nextDouble();
		patient.setWeight(weight);

		//Calendar class to get current year
		Calendar cal = Calendar.getInstance();
		patient.setCurrentYear(cal.get(Calendar.YEAR));

		// Call method to display the data.
		patient.displayMyHealthData();

	}

}
