package Pro;

import java.util.Scanner;

public class SeedOrNot {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int seed=0;
		
		int n1=sc.nextInt();
		sc.close();
		
		int temp=n1;
		seed=seed+n1;
		
		while(temp!=0)
		{
			int i=temp%10;
			seed=seed * i;
			temp=temp/10;
		}
		
		System.out.println(seed);
	}

}
