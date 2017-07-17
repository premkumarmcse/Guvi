package hunter;

import java.util.Scanner;

public class CaseSensitiveReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		char[] str1=s.toCharArray();
		char[] str2=new char[str1.length];
		
		int j=0;
		for(int i=str1.length-1;i>=0;i--)
		{
			str2[j]=Character.toLowerCase(str1[i]);
			j++;
		}
		
		for(int i=0;i<str1.length;i++)
		{
			if(Character.isUpperCase(str1[i]))
			{
				System.out.print(String.valueOf(str2[i]).toUpperCase());
			}
			else
			{
				System.out.print(str2[i]);
			}
		}
		sc.close();

	}

}
