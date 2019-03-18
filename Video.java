//Video.java
public class Video extends LibraryItemWithID implements LibraryItems{
	 
	//Class Variables 
	String maleStarring;
	String femaleStarring;
	
	public Video (String genere, String PlayTime,
			double price, String malestarring, String femalestarring)
	{
		super (genere,PlayTime,price);
		this.maleStarring=maleStarring;
		this.femaleStarring=femaleStarring;
		
	}
	public String getMaleStarring()
	{
		return maleStarring;
	
	}
	public String getFemaleStarring()
	{
		return femaleStarring;
	}
	//Overrides the method toString 
	public String toString()
	{
		return "item :Video"+
				"\nMovie\t"+getGenere()+
				"nMale Starring\t"+getMaleStarring()+
				"\nFemale Starring"+getFemaleStarring()+
				"\nDuration\t"+getPlayTime()+
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
