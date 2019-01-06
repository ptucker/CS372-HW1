/////////////////////////////////////
////// Program Name: String to Int
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
/////////////////////////////////////

import java.util.Scanner;

public class StringtoInt {
	
	public static void main(String args[])
	{
		String user;
		System.out.print("Enter a string of numbers ");
		Scanner snr = new Scanner(System.in);
		user = snr.nextLine();
		//PT -- this would be more readable:
		//  while (user.charAt(0) < '0' || user.charAt(0) > '9') 
		while (user.charAt(0) < 48 || user.charAt(0) > 57) //48-57 are the ASCII values for 0-9
		{						   //LN11: while a number isn't entered, ask for a new number
			System.out.print("That is not valid. Enter a valid number ");
			user = snr.nextLine();
		}
		
		int num = 0, place = 1;
		for (int i = user.length() - 1; i >= 0; i--)  //Access string from back to front
		{
			num += (user.charAt(i) - '0') * place; //Take the ASCII values and subtract the value for 0, giving the computer the actual number
			place *= 10; //Every time, increment by 10 to account for the tens, hundereds, etc places
		}
		System.out.println("You entered " + num); //num now equals whatever was in the string
	}
}
