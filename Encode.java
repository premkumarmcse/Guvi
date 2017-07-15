package Pro;

import java.util.Scanner;

public class Encode {													//Codekata Pro Set 7 - 1


	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		String s1=sc.next().toLowerCase();
		String s2=sc.next().toLowerCase();
		
		int e=0;
		int f=0;
		
		char[] c=s1.toCharArray();
		char[] d=s2.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if((int)c[i]>=113)
			{
				System.out.print((char)(c[i]-16));
			}
			else
			{
			e=Integer.valueOf(c[i])+10;
			System.out.print((char)e);
			}
		}
		
		System.out.print(" ");
		
		for(int i=0;i<d.length;i++)
		{
			if(i==0 || i==s2.length()-1)
			{
				System.out.print(d[i]);
			}
			
			else if((int)d[i]>=113)
			{
				System.out.print((char)(d[i]-16));
			}
			
			else
			{
			f=Integer.valueOf(d[i])+10;
			System.out.print((char)f);
			}
		}
		sc.close();
	}

}
