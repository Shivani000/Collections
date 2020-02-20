/*
6. Retrieve the max from array which is in a odd-index
*/
import java.util.*;
public class Coll6 {
      public static void main(String[] args) {
    	  Scanner sc=new Scanner(System.in);
    	  int n=sc.nextInt();
    		  int[] n1=new int[n];
    		  for(int i=0;i<n;i++)
        	  {
    			  n1[i]=sc.nextInt();
    		  
    	  }
          
            System.out.println(odd(n1));
      }
      public static int odd(int[] a) {
            List l = new ArrayList();
            for(int i = 0;i < a.length;i++)
                  if(i%2 != 0)
                        l.add(a[i]);
            int b=0;
            for(int i = 0;i < l.size();i++){
                  int c = (Integer) l.get(i);
                  if(c > b)
                        b = c;
            }
            return b;
      }
}