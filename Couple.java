import java.util.*;
import java.io.*;
public class Couple {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,j,x=0,i;
		n=sc.nextInt();
		int a[]=new int[100];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
			
		
		for( i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;a[j]=0;
				}
			}
		}
		for(i=0;i<n;i++)
			{if(a[i]!=0)
		System.out.println(a[i]);
			}

	}

}
