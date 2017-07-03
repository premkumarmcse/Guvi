package hunter;

import java.util.Scanner;

public class SumOfPower {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		
		int c=0;
		int sum=0;
		int temp=n;
		
		while(temp!=0)
		{
			int i=temp%10;
			sum=sum+(int) Math.pow(i,c);
			temp=temp/10;
			c=i;
		}

		System.out.println(sum);
	}

}
