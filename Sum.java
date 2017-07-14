package hunter;

import java.util.Scanner;

public class Sum {																//Hunter set-11 102


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int sum=0;
		
		for(int i=s.length();i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				sum+=Integer.valueOf(s.substring(j,j+1));
			}
		}

		System.out.println(sum);
	}

}
