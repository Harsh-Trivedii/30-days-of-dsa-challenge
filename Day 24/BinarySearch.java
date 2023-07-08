import java.util.*;
public class BinarySearch{
	public static void main(String args[])
	{
		BinarySearch b=new BinarySearch();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements:");
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();	
		}	
		System.out.println("Enter element you want to search:");
		int key=s.nextInt();
		Arrays.sort(a);
		System.out.println("Sorted array:");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}	

		b.binarysearch(a,key);
	}
	void binarysearch(int a[],int key)
	{
		int beg=0,end=4;
		int mid=(beg+end)/2;
		while(beg<=end)
		{
			if(a[mid]>key)
			{
				end=mid-1;
			}
			else if(a[mid]<key)
			{
				beg=mid+1;
			}
			else{
				System.out.println("\nElement found at index:"+mid);
				break;
			}
			mid=(beg+end)/2;	
		}
		if(beg>end)
		{
			System.out.println("\nElement not found!");
		}
	}
}
