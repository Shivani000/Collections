

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CollDay1Pro8 {

	
	public static ArrayList<String> calculateAge(Map<String, String> m) throws ParseException
	{	ArrayList<String> l1 = new ArrayList<String>();
		Iterator<Map.Entry<String,String>> itr= m.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> entry = itr.next();
		String s1= entry.getKey();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		Date d1=sdf.parse(entry.getValue());
		Calendar c=Calendar.getInstance();
		c.setTime(d1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		LocalDate lc1=LocalDate.of(year, month, day);
		LocalDate lc2=LocalDate.now();
		Period diff=Period.between(lc1, lc2);
		//System.out.println("age"+);
		if(diff.getYears() >= 18) {
			l1.add(s1);
			}
		}
		return l1;
		
		
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		String name,dob;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,String> m=new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			name=sc.next();
			dob=sc.next();
			m.put(name, dob);
		}
	/*	Set<Map.Entry<String,String>> m=h1.entrySet();
		Iterator<Entry<String, String>> itr=m.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		ArrayList<String> m1=calculateAge(m);
		System.out.println(m1);
	}

}
