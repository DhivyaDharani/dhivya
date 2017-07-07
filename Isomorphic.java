import java.io.*;
import java.util.*;
class Isomorpic
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a1=sc.next();
String a2=sc.next();
String out="";
if(a1.length()==a2.length())
{
for(int i=0;i<a1.length();i++)
{
out=a1.replace(a1.charAt(i),a2.charAt(i));
s1=out;
}
if(out.equals(s2)
{
System.out.priintln(true);
}
else
{
  System.out.println(false);
}
}
else
{
System.out.println(false);
}
}
}
