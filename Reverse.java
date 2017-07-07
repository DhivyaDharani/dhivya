import java.util.*;
import java.io.*;
public class Reverse
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
StringBuffer str1 = new StringBuffer(br.readLine());
System.out.println(str1.reverse());
}
}
