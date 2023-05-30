import java.util.*;
public class SumHourGlass
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int r=s.nextInt();
		System.out.println("Enter number of columns:");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter array elements:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		if(r<3 || c<3)
		{
			System.out.println("Hour glass not possible");
		}
		else{
			int maxsum=Integer.MIN_VALUE;
			int sum=0;
			for(int i=0;i<r-2;i++)	
			{
				for(int j=0;j<c-2;j++)
				{
					sum=(a[i][j]+a[i][j+1]+a[i][j+2])+(a[i+1][j+1])+(a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);	
					maxsum=Math.max(maxsum,sum);
				}
			}
			System.out.println("Maximum sum of hour glass:"+maxsum);
		}

	}

}
