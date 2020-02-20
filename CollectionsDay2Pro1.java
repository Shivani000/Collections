/* Problem Statement 1:
1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even
numbers from 2 to N, where N is a integer which is passed as a parameter to the method
storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the arrayList
A1 in step 1, and It should multiply each number with 2 and display it in format 4,8,12....2*N.
and add these numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be
returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should return
the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.

NOTE: You can test the methods using a main method.

*/
import java.util.*;
class CollectionsDay2Pro1
{
	static List<Integer> A1=new ArrayList<Integer>();
	static List<Integer> A2=new ArrayList<Integer>();
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println(Enter the value or size of n);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(i%2==0)
			{	  Integer a =  new Integer(i);
				storeEvenNumbers(a);
			}
		}
		System.out.println(A1);
		System.out.println(printEvenNumbers());
		System.out.println("Enter key value");
		int k1=sc.nextInt();
		
		Integer k2 =  new Integer(k1);
		retrieveEvenNumbers(k2);
		
		

	}
	public static List<Integer> storeEvenNumbers(Integer a)
	{
		A1.add(a);
		return A1;
	}
	public static List<Integer> printEvenNumbers()
	{
		Iterator itr=A1.iterator();
		while(itr.hasNext())
		{
		Integer b3=(Integer)(itr.next());
		int b=b3.intValue();
		 int b1= b*2;
		Integer b2 =  new Integer(b1);
		A2.add(b2);
		}
		return A2;
	}
	public static int retrieveEvenNumbers(Integer key)
	{
			
			Integer[] arr=A1.toArray(new Integer[0]);
		int val=Arrays.binarySearch(arr,key);
		if(val>0)
		{
		System.out.println(key+" is present at "+val);
		return val;
		}
		else
		return 0;
	}
}
	