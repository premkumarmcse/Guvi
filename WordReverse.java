package hunter;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		
		String[] s1=s.split("\\s");

		for(int i=s1.length-1;i>=0;i--)
		{
		System.out.print(s1[i]+" ");
		}

}
}
