//CD.java
public class CD extends LibraryItemWithID implements LibraryItems
{
	//class variables 
	String albumTitle;
	
	//constructor with arguments
	public CD (String genere,String PlayTime,
			String albumTitle, double price)
	{
		/*Calling base class constructor 'Abstract class:
		 * Magazine' with arguments
		 */
		super(genere,PlayTime,price);
		this.albumTitle=albumTitle;
	}
	//Retunrs albumTitle value
	public String getAlbumTitle ()
	{
		return albumTitle;
	}
	//Overrides the method toString
	public String toString()
	{
		return "Item :Comapct Disc"+
	"\nAlbumTitle\t"+getAlbumTitle()+
	"nAlbum Genere\t"+getGenere()+
	"\nDuration"+getPlayTime()+
	"\nPrice\t$"+getPrice();
		
	}
	private String getPlayTime() {
		// TODO Auto-generated method stub
		return null;
	}
	private String getGenere() {
		// TODO Auto-generated method stub
		return null;
	}

}
