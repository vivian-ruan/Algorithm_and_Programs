import java.util.Arrays;
class RevertArray
{
	public static void main(String[] args) 
	{
		int[] a={2,4,5,6,7,8,67};
		System.out.println("original array: " + Arrays.toString(a));
		swap(a);
		System.out.println("swap array : " + Arrays.toString(a));
	}

	public static void swap(int[] a){
		int j=a.length;
		for (int i=0; i<j/2 ; i++ )
		{
			int tmp=a[i];
			a[i]=a[j-1-i];
			a[j-1-i]=tmp;
		}
	
	}
}
