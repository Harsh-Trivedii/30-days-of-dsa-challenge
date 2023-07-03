import java.util.*;
public class BubbleSort
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=5;
		System.out.println("Enter array elements:");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Elements after bubble sort:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}
