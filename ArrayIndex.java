package Pro;

public class ArrayIndex {

	public static void main(String[] args) {
	
		int[] a={-3,-1,1,3,4};
		arr_index(a);
	}

	private static void arr_index(int[] a) {
		
		for(int i=0;i<a.length;i++)
		{
		if(String.valueOf(a[i]).equals(String.valueOf(i)))
		{
			System.out.println(a[i]);
		}
		}
		
	}

}
