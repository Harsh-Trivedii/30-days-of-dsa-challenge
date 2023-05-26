// Maximum product of sub-array
import java.util.*;
public class MaxSubArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of array elements:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int product=1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			product=1;
			for(int j=i;j<n;j++)
			{
				product*=arr[j];
				max=Math.max(product,max);  // maximum between the two will return
			}
		}
		System.out.println("Max product:"+max);				
		
	}
}
