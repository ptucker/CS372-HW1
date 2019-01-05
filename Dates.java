//////////////////////////////////
////// Program Name: Date Class
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
//////////////////////////////////

import java.util.*;
import java.text.SimpleDateFormat;

//I tried to make a DatesTest class, but the console wasn't recognizing the functions in Dates correctly.
public class Dates 
{
    
	int month;
    
	int day;
    
	int year;
    
	Dates()
    
	{
        
		month = 12;
        
		day = 1;
        
		year = 1998;
    
	}
    
	Dates(int m, int d, int y)
	{
		month = m;
		day = d;
		year = y;
	}
	public void setMonth(int m)
     //This takes the date a month at a time, and if,
	{
        			// for example, the user tries to enter April 31th, 
		if (1 <= m && m <=12)
   //The date will be taken from the default constructor instead     
		{
            
			month = m;
        
		}
    
	}
    
	public void setDay(int d)
    
	{
    
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
        
		{
            
			if (1 <= d && d <= 31)
            
			{
                
				day = d;
            
			}
        
		}
    
			else if (month == 4 || month == 6 || month == 9 || month == 11)
        
			{
            
				if (1 <= d && d <= 30)
            
				{
                
					day = d;
            
				}
        
			}
    
				else if ((month == 2) && (year % 4 == 0))
   // leap year instance     
				{
            
					if (1 <= d && d <= 29)
            
					{
				
                day = d;
            
					}
        
				}
    
					else if (( month == 2) && (year % 4 != 0))
						if (1 <= d && d <= 28)
						{
							day = d;
						}	
	}
    
	public void setYear(int y) { year = y; }
    
	public int getMonth() { return month; }
    
	public int getDay() { return day; }
    
	public int getYear() { return year; }
    
	public void displayDate(int m, int d, int y)
    //Prints date in readable format
	{
        
		System.out.println("The date entered is " + m + "/" + d + "/" + y);
    
	}
    

	public static void dateDifference(Dates d1, Dates d2)  //Although this function isn't "smart" (months are assumed to be 30 days,
	{						       //years are assumed to be 365 days), I used the difference in terms of days
		int day;				       //and by converting years & months to days, found an "integer" value for the dates
		int month;
		int year;
		int diff;
		year = (d1.getYear() - d2.getYear()) * 365;
		month = (d1.getMonth() - d2.getMonth()) * 30;
		day = d1.getDay() - d2.getDay();
		diff = day + month + year;
		System.out.println("There are " + diff + " days between the two dates");
	}
	
	public static void futureDate(Dates d1, int n)    //Again found an int value for the date,  used mod to find the day first, subtracted the excess days to find 
	{						  //the new month number, then subtracted the excess months to find the new year 
		int sum, mod1, dayV, monthV, yearV;	
		sum = ((d1.getYear() * 365) + (d1.getMonth() * 30) + (d1.getDay() + n));
		mod1 = sum % 365;
		dayV = mod1 % 30;
		monthV = ((mod1 - dayV) % 30);
		yearV = ((sum - mod1) / 365);
		d1.setDay(dayV); 
		d1.setMonth(monthV);
		d1.setYear(yearV);
	}  


	public static void main(String args[]) 
	{
        
		Dates d1 = new Dates();
 
		Dates leap = new Dates();
		Dates today = new Dates();
		d1.setMonth(9);
		d1.setDay(31);   			//Create a date that doesn't exist; should default to constructor
		d1.setYear(2020);      
        
		d1.displayDate(d1.getMonth(), d1.getDay(), d1.getYear());


		leap.setMonth(2);
		leap.setYear(2020);  //Create a leap year date
		leap.setDay(29);
		      
        
		leap.displayDate(leap.getMonth(), leap.getDay(), leap.getYear());

		
		
		today.setDay(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));  	//From java library to find current date
		today.setMonth(Calendar.getInstance().get(Calendar.MONTH + 1));
		today.setYear(Calendar.getInstance().get(Calendar.YEAR));
		System.out.println("The current date is " + today.getMonth() + "/" + today.getDay() + "/" + today.getYear());
		
		dateDifference(d1, today); 		//Find the difference between d1 and the current date
		futureDate(d1, 300);			  //Find the date 300 days in the future
		System.out.println("the future date is " + d1.getMonth() + "/" + d1.getDay() + "/" + d1.getYear());
 
		
	} 
}
