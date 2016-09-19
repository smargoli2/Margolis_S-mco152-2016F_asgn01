import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter one number followed by another to get their sum.");
		Integer num1 = keyboard.nextInt();
		System.out.println("Enter the second number.");
		Integer num2 = keyboard.nextInt();

		Integer sum = Adder.Add(num1, num2);
		System.out.println("The sum is " + sum);
		
		keyboard.close();
	}

}
