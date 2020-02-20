import java.util.*;
class UniqueCollection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] s=new String[4];
		for(int i=0;i<s.length;i++){
			s[i]=sc.nextLine();}
		Set<String> s1=new TreeSet<String>(Arrays.asList(s));
		getCollections(s1);
		System.out.println(s1);
	}
	public static Set<String> getCollections(Set<String> s1)
	{	
		//List<String> l3=new ArrayList<String>();
		//Collections.sort(s1);
		return s1;
	}
}
