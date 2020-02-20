/* 4. Retrieve the palindorme-true number set from given number limit and
 return the sum
input1:90 input2:120
logic:99+101+111
output:311
Hint:List<Integer> l1=new ArrayList<Integer>();
*/
import java.util.*;
class Collection4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l1=new ArrayList<Integer>();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		for(int i=r1;i<=r2;i++)
		{
			int pal=i,rem=0;
			while(pal>0)
			{
				rem=(rem*10)+(pal%10);
				pal=pal/10;
			}
			if(rem==i)
			l1.add(i);
		}
		int sum=0;
		for(int i=0;i<l1.size();i++)
		{
			sum=sum+l1.get(i);
		}
		System.out.println(sum);
		
	}
}
				