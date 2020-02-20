/* 2. Retrieve the odd numbers till given input number. add and subtract it 
consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3
*/

import java.util.*;
public class Coll2
 {
	public static int diff(int n)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		if(i%2!=0)
		l1.add(i);
		int n1=l1.get(0);
		for(int i=1;i<l1.size();i++)
		if(i%2!=0)
		n1=n1+l1.get(i);
		else
		n1=n1-l1.get(i);
		return n1;
	}
	public static void main(String[] args)
	 {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(diff(n));
	}
}
