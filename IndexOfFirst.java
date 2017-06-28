package pro;

import java.util.Scanner;

public class IndexOfFirst {

	
	public static void main(String[] args) {
		int pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("String 1 : ");
		String s1=sc.nextLine();
		System.out.println("String 2 : ");

		String s2=sc.nextLine();
		sc.close();
		if(s1.contains(s2))
		{
			pos=s1.indexOf(s2);
		}
		else
			pos=-1;
		System.out.println("Output :"+pos);
	}

}
