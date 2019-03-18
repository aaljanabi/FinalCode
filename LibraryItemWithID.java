//LibraryItemWithIDnTitlenPtice.java

public abstract class LibraryItemWithID
{
	//class varibales 
	
	int id;
	String title;
	double price;
	
	//Constructor with argument
	
	public LibraryItemWithID (int id,String title,double price)
	{
		this.id=id;
		this.title=title;
		this.price=price;
	}
	
	public LibraryItemWithID(String genere, String playTime, double price2) {
		// TODO Auto-generated constructor stub
	}

	//Return id value
	public int getUniqueID()
	{
		return this.id;
	}
	//Returns title name
	public String getTitle()
	{
		return this.title;
	}
	//Return price value
	public double getPrice()
	{
		return price;
	}
}

