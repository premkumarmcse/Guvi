package Pro;

import java.util.Arrays;				//level=hunter&set=6

public class UniqueArray {

	public static void main(String[] args) {
	
		int c=0;
		int[] a={5,3,1,1,3};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					c=a[i];
				}
			}
		}
		System.out.println(c);

	}

}