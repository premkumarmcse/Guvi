package pro;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringDuplicate {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] s2=s1.toCharArray();
		LinkedHashSet<Character> hs=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			hs.add(s1.charAt(i));
		}
		Iterator<Character> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
		
	}

}

