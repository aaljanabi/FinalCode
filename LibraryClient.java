//LibraryClient.java
public class LibraryClient {
	public static void main(String[] args)
	{
		//constant Max value of type integer
		final int MAX=6;
		//create a new Libraryitem array
		LibraryItems[] item=new LibraryItems[MAX];
		
		//create a Book object with data values
		item[0]=new Book(23233, "Java","Marty Steep","Pearson",50);
		System.out.println(item[0]);
		System.out.println ();
		
		//create Magazine object with date values
		item[1]=new Magazine (1121287, "Vizagmagz","college","05/02/2012",2);
		System.out.println(item[1]);
		System.out.println();
		
		//create a CD object with data values 
		item[2]=new CD("Rock-Band","00:55","Ricky-Martin",10);
		System.out.println(item[2]);
		System.out.println();
		
		//create a Video object with data values
		item[3]=new Video("Titanic","01:55",10,"Leonardo DiCaprio","Kate Winslet");
		System.out.println(item[3]);
		System.out.println();
		
		
			
	}

}
