import java.util.Scanner;

public class StringtoInt {
	
	public static void main(String args[])
	{
		String user;
		System.out.print("Enter a number ");
		Scanner snr = new Scanner(System.in);
		user = snr.nextLine();
		while (user.charAt(0) < 48 || user.charAt(0) > 57)
		{
			System.out.print("That is not valid. Enter a valid number ");
			user = snr.nextLine();
		}
		
		int num = 0, place = 1;
		for (int i = user.length() - 1; i >= 0; i--)
		{
			num += (user.charAt(i) - '0') * place;
			place *= 10;
		}
		System.out.println("You entered " + num);
	}
}