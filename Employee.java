
///////////////////////////////////
////// Program Name: Employee Class
////// Name: Madi Binyon
////// Date: 2 January 2018
////// Class and Section: CS 372-1
///////////////////////////////////

public class Employee 
{
    
	private int ID;
	private String name;
   
	private String hireDate;
	private String position;
	private String higherUp;
	Employee()
    
	{
        
		ID = 1;
		name = "Madi";
 
		hireDate = "1 January 2019";
		position = "code monkey";
		higherUp = "Pete";          
	}
        
	Employee(int id, String n, String hd, String p, String hu)
	{
		ID = id;
		name = n;
		hireDate = hd;
		position = p;
		higherUp = hu;
	}
	public void setName(String n)
 {
 name = n;
 }
	public String getName() { return name; }
 
	public void setID(int id) { ID = id; }
	public int getID() { return ID; }
	public void sethireDate(String hd) { hireDate = hd; }
	public String gethireDate() { return hireDate; }
	public void setPosition(String p) { position = p; }
	public String getPosition() { return position; }
	public void sethigherUp(String hu) { higherUp = hu; }
	public String gethigherUp() { return higherUp; }     
          
       

}