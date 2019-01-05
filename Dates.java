//////////////////////////////////
////// Program Name: Date Class
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
//////////////////////////////////

import java.util.*;
import java.text.SimpleDateFormat;

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
    
	{
        
		if (1 <= m && m <=12)
        
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
    
				else if (month == 2)
        
				{
            
					if (1 <= d && d <= 28)
            
					{
				
                day = d;
            
					}
        
				}
    
	}
    
	public void setYear(int y) { year = y; }
    
	public int getMonth() { return month; }
    
	public int getDay() { return day; }
    
	public int getYear() { return year; }
    
	public void displayDate(int m, int d, int y)
    
	{
        
		System.out.println("The date entered is " + m + "/" + d + "/" + y);
    
	}
    

	public static void dateDifference(Dates d1, Dates d2)
	{
		int day;	
		int month;
		int year;
		int diff;
		year = (d1.getYear() - d2.getYear()) * 365;
		month = (d1.getMonth() - d2.getMonth()) * 30;
		day = d1.getDay() - d2.getDay();
		diff = day + month + year;
		System.out.print("There are " + diff + " days between the two dates");
	}
	
	public void futureDate(Date d1)
	{
		
	}
	
	public static void main(String args[]) 
	{
        
		Dates d1 = new Dates();
 
		Dates today = new Dates();
		d1.setMonth(9);
		d1.setDay(31);
		d1.setYear(2020);       
        
		d1.displayDate(d1.getMonth(), d1.getDay(), d1.getYear());

		
		
		today.setDay(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		today.setMonth(Calendar.getInstance().get(Calendar.MONTH + 1));
		today.setYear(Calendar.getInstance().get(Calendar.YEAR));
		today.displayDate(today.getMonth(), today.getDay(), today.getYear());
		
		dateDifference(d1, today);
 
		
	}   

}
