package test;

import java.util.Arrays;
import java.util.Scanner;

public class Specialpro69 {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int n=Integer.valueOf(s.replaceAll("[^\\p{Digit}]+",""));
		int[] a=new int[4];
		
		int temp=n;
		for(int i=0;i<a.length;i++)
		{
			a[i]=temp%10;
			temp/=10;
		}
		
		Arrays.sort(a);
		
		int max=a[a.length-1];
		int min=a[0];
	
		int sum=0;
		int i=0;
		while(i!=a.length)
		{
			sum+=max*a[i];
			i++;
		}
		
		int sum1=0;
		int j=0;
		while(sum>9)
		{
			sum1=0;
		while(sum!=0)
		{
			j=sum%10;
			sum1+=j;
			sum/=10;
		}
			sum=sum1;
		}				
		
		int temp1=1;
		
		for(j=0;j<a.length;j++)
		{
			temp1*=min+a[j];
		}
		
		int sum2=0;
		while(temp1>9)
		{
			sum2=0;
		while(temp1!=0)
		{
			int k=temp1%10;
			sum2+=k;
			temp1/=10;
			
		}
			temp1=sum2;
		}			  
		
		int square=(int)Math.pow(Math.min(sum1,sum2),2);
		
		System.out.println(square);
		
		sc.close();
}
}
