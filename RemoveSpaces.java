package hunter;

import java.util.Scanner;

public class RemoveSpaces {						//level=hunter&set=10

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(s.trim().replaceAll("\\s{2,}"," "));
		sc.close();
		}
	}


