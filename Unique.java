import java.util.*;
import java.io.*;
public class Unique {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
	
		int[] a=new int[n];
		
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("the sorted array is:");
		
	    Arrays.sort(a);
	
	for(int i=0;i<n;i++)
	{
		if(i==a[i])
		{
			System.out.println("the value"+a[i]+"is same as its index"+i);
		}
		
	}
	}

}
