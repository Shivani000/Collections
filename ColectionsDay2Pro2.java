/* Problem Statement 2:
1. Develop a java class with a instance variable Country HashSet (H1) add a method
storeCountryNames(String CountryName) , the method should add the passed country to
a HashSet (H1) and return the added HashSet(H1).
2. Develop a method retrieveCountry(String CountryName) which iterates through the
HashSet and returns the country if exist else return null.
*/
import java.util.*;
class ColectionsDay2Pro2
{
	String country;
	static HashSet<String> h1=new HashSet<String>();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of HashSet");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			String s=sc.nextLine();
	
			storeCountryNames(s);

		}
		System.out.println(h1);
		System.out.println("Enter the country name");
		String s1=sc.nextLine();
		System.out.println(retrieveCountry(s1));

		
	}
	public static HashSet<String> storeCountryNames(String s)
	{
		h1.add(s);
		return h1;
	}
	public static String retrieveCountry(String s1)
	{
		if(h1.contains(s1))
			return s1;
		else 
		return null;
	}
}