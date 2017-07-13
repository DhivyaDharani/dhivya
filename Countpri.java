import java.util.*;
import java.io.*;
public class Countpri
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,count=0,flag = 3,i,j;
System.out.println("Enter the lower limit");
a=sc.nextInt();
System.out.println("Enter the upper limit");
b=sc.nextInt();
System.out.println("The prime numbers between the range are:");
for(i=a;i<b;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;

}
}
if(flag==1)
{
System.out.println(i);
count++;
}
}

System.out.println("The number of prime numbers are:"+count);
}
}
