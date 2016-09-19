import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int userChoice = keyboard.nextInt();
		do {
			System.out.println("You can either add or subtract 2 numbers. "
					+ "This is a VERY sophiticated program. Enter 1 to add, 2 to subtract or 3 to exit.");
			userChoice = keyboard.nextInt();
			if (userChoice == 1) {
				System.out.println("Enter the first number.");
				Integer num1 = keyboard.nextInt();
				System.out.println("Enter the second number.");
				Integer num2 = keyboard.nextInt();
				Integer sum = Calculator.Add(num1, num2);
				System.out.println("The sum is " + sum);
			} else if (userChoice == 2) {
				System.out.println("Enter the first number.");
				Integer num1 = keyboard.nextInt();
				System.out.println("Enter the second number.");
				Integer num2 = keyboard.nextInt();
				Integer diff = Calculator.subtract(num1, num2);
				System.out.println("The difference is " + diff);
			} else {
				System.out.println("Goodbye!");
				System.exit(0);
				;
			}
		} while (userChoice == 1 || userChoice == 2);

		keyboard.close();
	}

}
