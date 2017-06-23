package pro;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumber {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	sc.close();
	
	String n=sc.nextLine();
	int k=sc.nextInt();
	
	char[] a=n.toCharArray();
	Arrays.sort(a);
	
	for(int i=0;i<k-1;i++)
	{
		System.out.print(a[i]);
	}
}
}
