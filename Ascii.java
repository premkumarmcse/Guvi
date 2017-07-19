package hunter;

import java.util.ArrayList;
import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		ArrayList<Integer> n=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++)
		{
			n.add((int)s.charAt(i));
		}
		
		int sum=0;
		for(int i=0;i<n.size();i++)
		{
			if(i!=n.size()-1)
			{
			int temp=n.get(i+1)-n.get(i);
			sum+=temp;
			}
		}
		System.out.println("sum : "+sum);
		int n1=Math.abs(sum-n.get(0));
		System.out.println("Character : "+(char)n1);
	}

}
