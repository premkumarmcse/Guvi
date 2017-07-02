package Pro;

import java.util.Scanner;

public class StringMultiplication {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		sc.close();
		
		int mul=Integer.parseInt(s1)*Integer.parseInt(s2);
		
		System.out.println(String.valueOf(mul));
	}

}
