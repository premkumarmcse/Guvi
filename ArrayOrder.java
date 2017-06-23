package pro;

import java.util.Scanner;

public class ArrayOrder {
	
	int countOne(String ref)
	{
		int c=0;
		for(int i=0;i<ref.length();i++)
		{
			if(ref.charAt(i)=='1')
				c++;
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		sc.close();
		ArrayOrder obj=new ArrayOrder();
		for(int i=0;i<a.length;i++)
		{
			int c=obj.countOne(Integer.toBinaryString(a[i])); 
			for(int j=i+1;j<a.length;j++)
			{
				int r=obj.countOne(Integer.toBinaryString(a[j]));
				if(c<r)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
