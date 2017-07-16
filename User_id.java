package Pro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
																// CodekataProSet 7 - 68
public class User_id {

	public static void main(String[] args) {
		
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First name : ");
		String firstName=sc.next();
		
		System.out.println("Enter the Last name : ");
		String lastName=sc.next();
		
		System.out.println("Enter the PIN : ");
		String pin=sc.next();
		
		System.out.println("Enter the N value : ");
		int n=sc.nextInt();
		
		String smallerName="";
		String longerName="";
		
		if(firstName.length()>lastName.length())
		{
			smallerName=lastName;
			longerName=firstName;
		}
		else if(lastName.length()>firstName.length())
		{
			smallerName=firstName;
			longerName=lastName;
		}
		else
		{
			List<String> LS=new ArrayList<String>();
			
			LS.add(firstName);
			LS.add(lastName);
			
			Collections.sort(LS);
			
			smallerName=LS.get(0);
			longerName=LS.get(1);
			
		}
		
		String user_id="";
		
		user_id = longerName.substring(0,1) + smallerName + pin.substring(n-1,n) + pin.substring(pin.length()-n,(pin.length()-n)+1);
		
		System.out.println("User_id : " + user_id);
		sc.close();
	}

}
