import java.util.*;
class CollectionsPro10
{
	public static void main(String args[])
	{
		int rem=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=n+"";
		//String t="";
		char[] ch=s.toCharArray();
		int c1[]=new int[10];
		for(int i=0;i<ch.length-1;i++)
		{
			c1[i]=Math.abs(ch[i]-ch[i+1]);
			System.out.print(c1[i]+"");
				
		}
		
		System.out.print(ch[ch.length-1]);
		
	}
}	
			
		