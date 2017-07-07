package gee;

import java.util.*;
import java.io.*;
public class Reversenum
{
public static void main(String args[])
{
int n,rev=0,r,a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
a=n;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println("Reverse: "+rev);
}
}
