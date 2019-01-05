////////////////////////////////////
////// Program Name: Body Mass Index
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
////////////////////////////////////

import java.util.Scanner;



public class BMI 
{
    
	public static void main(String args[]) 
	{
        
		double weightInPounds;
        
		double heightInInches;
 
		double weightinKG;  
		double heightinM;   
		double BMI;
        
		Scanner scnr = new Scanner(System.in);
        
		System.out.println("Enter your weight in pounds: ");
        
		weightInPounds = scnr.nextInt();
        
		System.out.println("You entered " + weightInPounds + " lbs.");
        
		System.out.println("Enter your height in inches: ");
        
		heightInInches = scnr.nextInt();
        
		System.out.println("You entered " + heightInInches + " in.");

		weightinKG = weightInPounds / 2.205;  //Conversion from pounds to kg
		heightinM = heightInInches / 39.37;   //Conversion from inches to m
		BMI = weightinKG / (heightinM * heightinM);
  //Fomula for SI BMI       
		System.out.printf("Your BMI is %f", BMI);
        
		

		System.out.println("");
        
		System.out.println("BMI VALUES");
        
		System.out.println("Underweight: less than 18.5");
        
		System.out.println("Normal: betwen 18.5 and 24.9");
        
		System.out.println("Overweight: between 25 and 29.9");
        
		System.out.println("Obese: 30 or greater");
        
		System.out.println("");
        
		if (BMI < 18.5)
      //Tells the user where the fall in the calculation
			System.out.println("You are underweight");
            
		else if (18.5 <= BMI && BMI <= 24.9)
                
			System.out.println("You are a normal weight");
                
		else if (25 <= BMI && BMI <= 29.9)
                
			System.out.println("You are overweight");
                    
		else if (30 <= BMI)
                    
			System.out.println("You are obese");
    
	}

}