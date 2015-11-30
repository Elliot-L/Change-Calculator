import java.util.Scanner;
public class ChangeCalculator {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the price of the object in dollars");
		double price = keyboard.nextDouble();
		System.out.println("Enter the amount paid in dollars");
		double paid = keyboard.nextDouble();
		double change = paid - price;
		if (change == 0){
			System.out.println("Exact change was paid");
		}
		else if (change < 0){
			System.out.println("An insufficient amount was paid");
		}
		else {
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			while (change > 0.0){
				if (change >= 0.25){
					quarters += 1;
					change -= 0.25;
				}
				else if (change >= 0.1){
					dimes += 1;
					change -= 0.1;
				}
				else if (change >= 0.05){
					nickels += 1;
					change -= 0.05;
				}
				else{
					pennies += 1;
					change -= 0.01;
				}
			}//ends while loop
			System.out.print("The minimum number of coins needed is " + quarters + " quarters, " + dimes + " dimes, "); 
			System.out.println( nickels + " nickels, and " + pennies + " pennies");
		}
	}//ends main method
}//ends class
