/////////////////////////////////////
////// Program Name: Area of a Circle
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
/////////////////////////////////////

import java.util.Scanner;



public class CircleArea 
{
    
	public static void main(String args[])
	{
       
		final double PI = 3.14;
       
		double radius;
       
		double area;
       
		Scanner scrn = new Scanner(System.in);
       
		System.out.print("Enter the radius of the circle: ");
       
		radius = scrn.nextInt();
       
		System.out.println("You entered " + radius);
       
		area = (radius * radius * PI);
       
		System.out.print("The area of the circle is " + area);
    
	}

}