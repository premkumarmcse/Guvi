package Pro;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[] a={1,2,3,4,5,6,7};
		
		System.out.print("d = ");
		int d=sc.nextInt();

		String s1="";
		sc.close();
		
		for(int i=0;i<a.length;i++)
		{
			
			s1=s1+String.valueOf(a[i]);
			
		}

		String s2=s1.substring(0,d);
		String s3=s1.substring(d,s1.length())+s2;
		char[] c=s3.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}

}
