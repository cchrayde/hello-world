package twoIntegers;
import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int firstNumber,secondNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");
		firstNumber = input.nextInt();
		System.out.println("Thanks you entered "+firstNumber);
		
		System.out.println("Please enter your second number");
		secondNumber = input.nextInt();
		System.out.println("Thanks you entered "+secondNumber);
		
		System.out.println("The sum of the two numbers is");
		System.out.println(firstNumber+secondNumber);
		

	}

}
