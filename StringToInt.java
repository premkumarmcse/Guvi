package player;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
	
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String : ");
		 String s1=sc.next();
		 System.out.println(Integer.valueOf(s1));
		 sc.close();
	}

}
