/* 5.HashMap with regnum as key and mark as value. find the avg of marks
 whose key is odd.
input:{12:90,35:90,33:90,56:88}
output:avg of(90+90) =90

*/

import java.util.*;
public class Coll4 {
      public static int sumOfPalindromeNos(int n1,int n2){
            List l1 = new ArrayList();
            for(int i = n1;i <= n2;i++){
                  int r = 0,n3 = i;
                  while(n3 != 0){
                        r = (r*10)+(n3%10);
                        n3 = n3/10;
                  }
                  if(r == i)
                        l1.add(i);
            }
            System.out.println(l1);
            int s = 0;
            for(int i = 0;i < l1.size();i++)
                  s =s+l1.get(i);
            return s;
      }
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("enter the range:");
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindromeNos(n1,n2));
      }
}import java.util.*;
public class Coll5 {
      public static int averageOfMarks(Map m1){
            int n = 0,c = 0;
            Iterator i = m1.keySet().iterator();
            while(i.hasNext()){
                  Integer b = (Integer) i.next();
                  if(b%2 != 0){
                        c++;
                        n+=m1.get(b);
                  }
            }
            return (n/c);
      }
      public static void main(String[] args) {
            Map m1 = new HashMap();
            m1.put(12, 90);
            m1.put(35, 90);
            m1.put(33, 90);
            m1.put(56, 88);
            m1.put(36, 67);
            System.out.println(averageOfMarks(m1));
      }
}