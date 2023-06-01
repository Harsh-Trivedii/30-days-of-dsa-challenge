// Matrix set zero 
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
import java.util.*;
public class MatrixZero
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row:");
		int r=s.nextInt();
		System.out.println("Enter column:");
		int c=s.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int temp[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				temp[i][j]=a[i][j];
			}
		}

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j]==0)
				{
					for(int k=0;k<r;k++)
					{
						temp[i][k]=0;
					}
					for(int k=0;k<c;k++)
					{
						temp[k][j]=0;
					}
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=temp[i][j];
			}
		}
		System.out.println("After setting zeros:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
