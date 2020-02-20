import java.util.*;
class MapManager
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		/*String[] s=new String[4];
		for(int i=0;i<s.length;i++){
			s[i]=sc.nextLine();}*/
		
		HashMap<String,String> m1=new HashMap<String,String>();
		m1.put("1","Hema");
		m1.put("2","Swarna");
		m1.put("3","Lohi");
		m1.put("4","Ravi");
		//Set<String> s1=new HashSet<String>(m1.keySet());
		getKeys1(m1);
		
	}
	public static void getKeys1(HashMap<String,String> m1)
	{	
		Set<String> s1=new HashSet<String>(m1.keySet());
		//List<String> l3=new ArrayList<String>();
		//Collections.sort(s1);
		s1.forEach(key-> System.out.println(key));
		
	}
}
