import java.util.*;
public class LeadersArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int curr,prev;
		System.out.println("Enter number of array elements:");
		int n=s.nextInt();
		int arr[]=new int[n];		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		prev=arr[n-1];
		System.out.print(arr[n-1]+" ");
		for(int i=n-2;i>=0;i--)
		{
			curr=arr[i];
			if(curr>prev)
			{
				System.out.print(curr+" ");
				prev=curr;
			}
		}
	}
}
