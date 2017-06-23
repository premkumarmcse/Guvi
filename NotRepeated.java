package pro;

import java.util.Scanner;

public class NotRepeated {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=j && a[i]==a[j])
				{
			
					c=1;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]);
			}
			c=0;
		}

}
}
