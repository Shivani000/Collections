import java.util.*;


public class Collection9 {

	public static void main(String []args) {
		ArrayList<String> string = new ArrayList<String>();{
		
		Scanner str = new Scanner(System.in);
		Scanner num = new Scanner(System.in);

		System.out.print("Enter the number of strings : ");
		int n = num.nextInt();
		
		System.out.println("Enter the strings : ");
		
		for (int i =0 ;i<n;i++) {
			
			String data = str.nextLine();
			string.add(data);
			
			
		}
		
		System.out.println("Data Entered by you : "+string);
		String c[] = new String[string.size()];
		
		for (int i=0;i<string.size();i++) {
			c[i] = (String) string.get(i);
			
		}
		
		String word  = new String();
		for (int i=0 ;i<c.length;i++ ) {
			
			
			word += c[i].substring(c[i].length()-1);
			
		}
		
		System.out.print("The word formed is : "+word);
		
		}
	}
	
	
}
