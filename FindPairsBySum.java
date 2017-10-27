import java.util.Arrays;

class FindPairsBySum 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,5,7,8,9};
		int n=10;
		expectSet(a,n);		
		
	}

	public static void expectSet(int[] a, int n){
		int left=0;
		int right=a.length-1;
		while(left<right){
			if(a[left]+a[right]>n){
			    right--;
			}else if(a[left]+a[right]<n){
			    left++;	
			}else{
			    System.out.println("[" + a[left]+ " " + a[right] + "]");
				if(a[right]==a[right-1]){
					right--;
				}else if (a[left]==a[left+1])
				{
					left++;
				}else{				
   			        left++;
				    right--;
				}
			}		
		}	
	}
}
