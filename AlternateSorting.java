package hunter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlternateSorting {						

	public static void main(String[] args) {

		ArrayList<Integer> AL=new ArrayList<Integer>();
		ArrayList<Integer> AL2=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number of Digits : ");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
		AL.add(sc.nextInt());
		}
		
		Collections.sort(AL);
		
		for(int i=0;i<AL.size()/2;i++)
		{
			if(AL.size()%2==0)
			{
				AL2.add(AL.get(AL.size()-1-i));
				AL2.add(AL.get(i));
			}
			else 
			{
				AL2.add(AL.get(AL.size()-1-i));
				AL2.add(AL.get(i));
			}
		}
			
		if(AL.size()%2!=0)
		{
			AL2.add(AL.get(AL.size()/2));
		}
		
		System.out.println(AL2);
		sc.close();
	}

}
