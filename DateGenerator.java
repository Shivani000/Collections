

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.Date;
import java.util.Scanner;

public class DateGenerator {
	public static String getDate(String s1,String s2,String s3)
	{
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=Integer.parseInt(s3);
		LocalDate d1=LocalDate.of(n1,n2,n3);
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatteddate=d1.format(f);
		return formatteddate;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		String s4=getDate(s1,s2,s3);
		System.out.println(s4);
	}

}
