package hunter;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s=in.next();
		in.close();
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		
		Iterator<Character> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}

}
