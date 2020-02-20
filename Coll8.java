/* 8. String[] input1=["Vikas","Lokesh",Ashok]
   expected output String: "Vikas,Lokesh,Ashok"
*/

import java.util.*;
import java.util.Map.Entry;
public class Coll9 {
      public static void main(String[] args) {
            HashMap < String,String > m1 = new HashMap < String,String > ();
            m1.put("ram","hari");
            m1.put("cisco","barfi");
            m1.put("honeywell","cs");
            m1.put("cts","hari");
            String s2 = "hari";
            getvalues(m1,s2);
      }
      public static void getvalues(HashMap < String, String > m1, String s2) {
            ArrayList < String > l1 = new ArrayList < String > ();
            for(Entry < String, String > m:m1.entrySet()){
                  m.getKey();
                  m.getValue();
                  if(m.getValue().equals(s2))
                        l1.add(m.getKey());
            }
            String[] op = new String[l1.size()];
            for(int i = 0;i < l1.size();i++){
                  op[i] = l1.get(i);
                  System.out.print(op[i]+" ");
            }
      }
}