import java.util.*;
class ListManager2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] s=new String[4];
		for(int i=0;i<s.length;i++){
			s[i]=sc.nextLine();}
		List<String> l1=Arrays.asList(s);
		getElements(l1);
		System.out.println(l1);
	}
	public static List<String> getElements(List<String> l1)
	{	
		//List<String> l3=new ArrayList<String>();
		Collections.sort(l1);
		return l1;
	}
}
