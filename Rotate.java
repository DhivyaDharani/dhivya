import java.util.*;
import java.io.*;

public class Rotate {
  public static void main(String args[])throws IOException
  {
	  Scanner sc=new Scanner(System.in);
	  int k,l;
	  l=sc.nextInt();
	  k=sc.nextInt();

	  int g=l-k;
	  System.out.println("enter the array");
	  int a[]=new int[l];
	  for(int i=0;i<l;i++)
	  {
		  a[i]=sc.nextInt();
	  }

	  int arr[]=new int[g];
	  
	  int arr1[]=new int[k];
	 int j=0;
	 // System.out.println(l);
	  for(int i=0;i<l;i++)
	  {
		 
		  if(i<4)
		  {
		arr[i]= a[i];
		
		
	  }
		  else
		  {
			  arr1[j]=a[i]; 
			  
			  j++;
		  }
		  
	  }
	  for(int i=0;i<arr1.length;i++)
	  
  {
		  System.out.println(arr1[i]);
  } 
  
	  for(int i=0;i<arr.length;i++)
		  
	  {
		  System.out.println(arr[i]);
	  }
		  
  }
}
