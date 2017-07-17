import java.io.*;
import java.util.*;


public class Armstrong {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,n,temp;
		int c=0;
	
		System.out.println("Enter the number you want to check:");
		a=sc.nextInt();
		temp=a;
		while(a>0)
		{
			n=a%10;
			a=a/10;
			c=c+(n*n*n);
			
					
		}
		
		if(temp==c){
			System.out.println("The given number is an armstrong ");
		}
		else
		{
			System.out.println("The given number is not an armstrong ");
		}
	}

}
