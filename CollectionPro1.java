/* 1. Given two integer arrays, merge the common elements into a new array.
 find the sum of the elements
input1:{1,2,3,4}
input2:{3,4,5,6}
logic:{3,4}
output:7
*/
import java.util.*;
class CollectionPro1
{
	
	
	public static void main(String args[])
	{
		int sum=0;
		ArrayList<Integer> a1= new ArrayList<Integer> ();
		ArrayList<Integer>  a2= new ArrayList<Integer> ();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		a1.retainAll(a2);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++)
		{
		int a=(a1.get(i)).intValue();
		sum = sum + a;
	
		}
		System.out.println(sum);
	}
}
		