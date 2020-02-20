

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.Scanner;

public class AgeCalculator {
	public static int calculateAge(String dob) throws ParseException
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		Date d1=sdf.parse(dob);
		Calendar c=Calendar.getInstance();
		c.setTime(d1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		LocalDate lc1=LocalDate.of(year, month, day);
		LocalDate lc2=LocalDate.now();
		Period diff=Period.between(lc1, lc2);
		//System.out.println("age"+);
		return diff.getYears();
		
	}

	public static void main(String[] args) throws ParseException 
	{
		Scanner sc=new Scanner(System.in);
		String dob=sc.next();
		int age1= calculateAge(dob);
		System.out.println(age1);
	}

}
