package Pro;

import java.util.Scanner;

public class SumofDigitPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int sum=0;
		
		while(n!=0)
		{
			int i=n%10;
			sum=sum+i;
			n=n/10;
		}

		System.out.println("sum : "+sum);
		
		StringBuffer sb=new StringBuffer(String.valueOf(sum));
		String rev=sb.reverse().toString();
		System.out.println("rev : "+rev);
		
		if(rev.equals(String.valueOf(sum)))
		{
				System.out.println("Palindrome Number");
		}	
		
		else
				System.out.println("Not a palindrome Number");
	}

}
