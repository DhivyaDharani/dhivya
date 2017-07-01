import java.util.*;
import java.io.*;
public class Alphabet
{
public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character that you want to check");
char ch=sc.next().charAt(0);
if(ch>='a' && ch<='z') || (ch>='A' && ch<='Z')
{
System.out.println("The given character is an alphabet");
}
else
{
System.out.println("the given character is not an alphabet");
}
}
}
