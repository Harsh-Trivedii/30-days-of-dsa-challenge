import java.util.*;
public class RevGroupArray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("How many elements you want to enter:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter group size:");
		int group=s.nextInt();
		reversegroup(a,n,group);
	}
	public static void reversegroup(int a[],int n,int group)
	{
		int left;
		int right;
		for(int i=0;i<n;i+=group)
		{
			left=i;
			right=Math.min(i+group-1,n-1);
			while(left<right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println("After reverse in group:");
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
