import java.util.*;
class CollectionsPro8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String[] s=new String[4];
		
		for(int i=0;i<length;i++){
			s[i]=sc.nextLine();}
			String t=sc.nextLine();
			String s1="";
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i].contains(t))
			{
				int n=s[i].indexOf('_');
				s1=s[i].substring(n+1);
			}
		}
				
		System.out.println(s1);
		
	}
}























	/*public static String accessCapital(String[] s)
	{
		for(int i=0;i<s.length-1;i++)
		{
			if(s[i].charAt(i)=='_')
			{
				String s1=s[i];
			}
		}
		return s1;
	}*/

	