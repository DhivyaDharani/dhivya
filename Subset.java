package guvicodekata;
import java.util.*;
import java.io.*;

public class Subset {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,m,count=0;
		n=sc.nextInt();
		m=sc.nextInt();
		int array1[]=new int[n];
		int array2[]=new int[m];
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
			
		}
		for(int j=0;j<m;j++)
		{
			array2[j]=sc.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			for(int l=0;l<m;l++)
			{
				if(array1[k]==array2[l])
				{
					count++;
				}
			}
		}
				if(count==m)
				{
				System.out.println("array2 is a subset of array1");
				}
				else
				{
					System.out.println("array2 is not a subset of array2");
				}
			
		
		
	}

}
