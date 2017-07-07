
import java.util.*;
import java.io.*;
public class Factorial
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
int n,res=1,i;
System.out.println("Enter the number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
res=res*i;
}
System.out.println(res);
}
}
