//Book.java
public class Book extends LibraryItemWithID implements LibraryItems
{
	//Declare class variables
	String author;
	String publisher;
	
	//Constructor with arguments
	public Book(int isbn,String title, String author, String publisher, double price)
	{
		/*Calling base class constructor 'Abstract class: 
		 * LibraryItemWithIDnTitlenPtice' with arguments
		 */
		super (isbn,title,price);
		this.author=author;
		this.publisher=publisher;
		
	}
	//Return author name
	public String getAuthor()
	{
		return author;
	}
	//Returns publisher name
	public String getPublisher()
	{
		return publisher;
	}
	//Overrides method toString
	public String toString()
	{
		return "Item :Book"+
		"\nISBN\t"+getUniqueID()+
		"\nTitle\t"+getTitle()+
		"\nAuthor\t"+getAuthor()+
		"\nPublisher"+getPublisher()+
		"\nPrice\t$"+getPrice();
		
	
	}

}
