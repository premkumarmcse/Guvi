package pro;

import java.util.Scanner;
import java.util.Arrays;

public class HeightOfStudent {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of students in a class : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter the height of the students : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a.length>=4)
		{
		Arrays.sort(a);
		
		System.out.println("Fourth tallest student in a class is : "+a[3]);
		System.out.println("Enter the K-th tallest student : ");
		int k=sc.nextInt();
		sc.close();
		System.out.println("The height of K-th student is : "+a[k-1]);
		}
	}

}
