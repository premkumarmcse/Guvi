package hunter;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		
		char[] c=s.toCharArray();
		
		for(int i=0;i<s.length()-1;i++)
		{
			if((int)c[i]==97)
			{
				System.out.print("z");
			}
			else if((int)c[i]>97 && (int)c[i]<=122)
			{
				System.out.print((char)(c[i]-1));
			}
		}
		System.out.print(c[c.length-1]);
		sc.close();
	}

}
