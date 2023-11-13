package ct;
import java.util.Scanner;

public class mod5 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int months = 12;
		String[] monthsArray = new String[] {"January", "February",
				"March", "April", "May", "June", "July", "August",
				"Septempter", "October", "November", "December"};
		float[] tempArray = new float[months];
		
		
		
		for (int i = 0; i < months; i++) {
			System.out.println("Please enter " + monthsArray[i] +
					"'s average temperature:");
			tempArray[i] = userInput.nextFloat();
			
		}
		float sum = 0;		
		for (int i = 0; i < tempArray.length; i++) {
			sum += tempArray[i];
		}
		
		System.out.println("Type which month you want to view temperature average:");
		System.out.println("Or type 'year' to see yearly temperature stats:");
		
		String input = userInput.next();
		if (input.equals("year")) {
		
		System.out.println("The average temperature for each month was:");
		for (int i = 0; i < months; i++) {
			System.out.println(monthsArray[i]+": "+tempArray[i]);			
		}
		
		System.out.println("The average temperature for the year was: " + sum/12);
		}
		else {
			for (int i = 0; i < 12; i++) {
				if (input.equals(monthsArray[i])) {
					System.out.println(monthsArray[i] + "'s average temperature was " + tempArray[i] + " degrees");
				}
			}
		}
		userInput.close();
}
}
