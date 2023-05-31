import java.util.*;
public class SpiralMatrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n=s.nextInt();
		System.out.println("Enter number of columns:");
		int m=s.nextInt();
		char move='r';
		int boundary=n-1;
		int sizel=n-1;
		int a[][]=new int[n][m];
		int r=0,c=0;
		int flag=1;
		for(int i=1;i<n*m+1;i++)
		{
			a[r][c]=i;
			switch(move)
			{
				case 'r':
					c++;
					break;
				case 'd':
					r++;
					break;
				case 'l':
					c--;
					break;
				case 'u':
					r--;
					break;
			}
			if(i==boundary)
			{
				boundary=boundary+sizel;
				if(flag!=2)	
				{
					flag=2;
				}		
				else{
					flag=1;
					sizel=sizel-1;
				}		
				switch(move)
				{
					case 'r':
						move='d';
						break;
					case 'd':
						move='l';
						break;
					case 'l':
						move='u';
						break;
					case 'u':
						move='r';
						break;
				}
			}
				
		}
		System.out.println("Spiral Matrix:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
