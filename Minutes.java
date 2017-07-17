import java.util.*;
import java.io.*;

public class Minutes {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
	int a,b,c;
	System.out.println("Enter the time limit at 24 hours format");
	System.out.println("Enter the starting time");
	a=sc.nextInt();
	System.out.println("Enter the ending time");
	b=sc.nextInt();
	c=b-a;
	int d=c*60;
	System.out.println("The minutes between the given intervals is:"+d+"minutes");
	}
}
