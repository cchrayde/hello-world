package positive.negative;
import java.util.Scanner;

public class IntPositiveNegative {

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number:");
		number = scan.nextInt();
		scan.close();
		if(number > 0)
		{
			System.out.println(number+" is positive number");
		}
		else if(number < 0)
		{
		    System.out.println(number+" is negative number");
		    
		}

	}

}
