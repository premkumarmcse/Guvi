package player;

import java.io.IOException;
import java.util.Scanner;

public class CharSwap {															//CodekataPlayerSet 1

	public static void main(String[] args) throws IOException{

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		String s1="";
		String s2="";
		
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				s1+=c[i];
			}
			else
			{
				s2+=c[i];
			}
		}
		
		try
		{
		for(int i=0;i<s1.length();i++)
		{
		System.out.print(s2.charAt(i)+""+s1.charAt(i));
		}
		}
		catch(Exception e)
		{
			if(s.length()%2==1)
			{
				System.out.println(s.charAt(s.length()-1));
			}
		}
		sc.close();

}
}
