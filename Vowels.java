import java.util.*;
import java.io.*;
public class Vowels
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the letter you want to check");
char x=br.read();
if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
{
System.out.println("the given letter is a vowel");
}
else
{
System.out.println("the given is a constant");
}
}
}
