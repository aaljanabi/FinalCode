//Magazine.java
public class Magazine extends Book implements LibraryItems 
{
	//Magazine class variables
	String typeOFMagazine;
	String DateOfRelease;
	
	
	//constructor with arguments
	public Magazine (int isbn, String title, String typeOfMagazine,
			String DateOfTrlrase, double price)
	{
		/*Calling base class constructor 'Abstract class:
		 * Book' with arguments
		 */
		
		super (isbn,title,DateOfTrlrase, DateOfTrlrase, price);
		this.typeOFMagazine=typeOFMagazine;
		this.DateOfRelease=DateOfRelease;
		
	}
	//Returns typeOFMagazine string value
	
	public String getMagazineType ()
	{
		return typeOFMagazine;
	}
	//Returns DateOfRelease string value 
	public String getDOR()
	{
		return DateOfRelease;
	}
	//Overrides method toString
	
	public String toString()
	{
		return "Item :Magazine"+
				"\nMagazine id\t"+getUniqueID()+
				"\nTitle\t"+getTitle()+
				"\nMagazine of\t"+getMagazineType()+
				"\nDate of Release"+getDOR()+
				"\nPrice\t$"+getPrice();
		
	}
}
