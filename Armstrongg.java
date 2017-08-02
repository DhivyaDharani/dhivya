import java.util.*;
import java.io.*;
public class Armstrongg {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int b,end;
	System.out.println("Enter the Starting range:");
b=sc.nextInt();
	System.out.println("Enter the Ending range:");
	end=sc.nextInt();

    int a,c,sum,count=0; 
     
    while(b<=end) 
         { 
             sum=0; 
             c=b; 
             while(c>0) 
                  { 
                     a=c%10; 
                     sum=sum+(a*a*a); 
                     c=c/10; 
                  } 
              if(sum==b) 
            { 
              System.out.println(b+" is a Armstrong Number"); 
              count=count+1; 
            } 
               b++; 
          } 
System.out.println("Total Armstrong Number Present With in that Range is "+count); 
     }

	
	
}

