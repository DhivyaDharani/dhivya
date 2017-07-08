import java.util.*;
import java.io.*;
public class Swap
{
public static void main(String args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
String str=br.readLine();
int i,j;
char temp;
  for(i=0;i<str.length;i=i+2)
