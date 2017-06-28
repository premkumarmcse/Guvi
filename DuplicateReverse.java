package pro;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateReverse {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		sc.close();
		
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer s2=sb.reverse();
		String s=new String(s2);
		
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		
		for(int i=0;i<s1.length();i++)
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

