package guvicodekata;
import java.io.*;
import java.util.*;

public class Happy {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter the number you want to check");
	a=sc.nextInt();
	int b=0,e=0,i,dd=0;  
	int c=0,d = a;
	int ans = 0;
//	for(int i=0;a!=1;i++)
	//{
		
for(i=0;d!=1 && i<20;i++)
	{
		if(d>99){ dd=d;b=dd%10; dd=dd/10; c=dd%10; dd=dd/10; e=dd%10;}
		else{b=d%10; c=d/10;}
		
		
	d=(int) (Math.pow(b,2)+Math.pow(c,2)+Math.pow(e, 2));
	
	}
	
	if(d==1)
	{
		System.out.println("The number is a happy number");
	
			
	}
	else
	{
	System.out.println("The number is not a happy number");

}
}
}

