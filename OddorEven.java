//////////////////////////////////
////// Program Name: Odd or Even
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
//////////////////////////////////

import java.util.Scanner;



public class OddorEven 
{
    
	public static void main(String args[]) 
	{
       
		int userInt;
     
		Scanner scnr = new Scanner(System.in);
  
		System.out.print("Enter a number between 10 and 100");     
		userInt = scnr.nextInt();
  
     		
		for (int i = 0; i < userInt; i++)
		{ 
			if (i % 2 == 0)
           
				System.out.println(i + " is even");
    
   
			if (i % 2 == 1)
            
				System.out.println(i + " is odd");
  
		}
	}


}