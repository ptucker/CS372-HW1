
///////////////////////////////////
////// Program Name: Employee Class
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
///////////////////////////////////

public class EmployeeTest {
	
public static void main(String args[]) 
	{
            
		Employee e1 = new Employee(); 
       //Create a default employee 
		Employee e2 = new Employee(2, "Jack", "20 December 2016", "team lead", "Pete");
  
		Employee e3 = new Employee(1000, "Dave", "4 January 2019", "coffee runner", "Jack");
		System.out.printf("Employee %d is %s, they report to %s, and they are a %s.", e1.getID(), e1.getName(), e1.gethigherUp(), e1.getPosition());      
		System.out.println();  //Use printf to display the employees in a cleaner format
		System.out.printf("Employee %d is %s, they report to %s, and they are a %s.", e2.getID(), e2.getName(), e2.gethigherUp(), e2.getPosition());       
		System.out.println();
		System.out.printf("Employee %d is %s, they report to %s, and they are a %s.", e3.getID(), e3.getName(), e3.gethigherUp(), e3.getPosition());       
	
	}
}