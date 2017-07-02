package hunter;

import java.util.Arrays;
import java.util.Scanner;

public class K_arrayRotation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array size : ");
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		int[] b=new int[n];
		
		System.out.println("Enter the Array Elements : ");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("Enter the K-times Rotated Array Elements : ");
		
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0;i<a.length;i++)
		{
			if(String.valueOf(b[0]).equals(String.valueOf(a[i])))
			{
				System.out.println("The value of K = "+i);
			}

	}

}
}
