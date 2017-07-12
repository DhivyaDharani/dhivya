import java.util.*;
public class Camel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
String a=sc.nextLine();
String res="";
char first = input.charAt(0);
res = res + Character.toUpperCase(firstChar);
for(int i=0;i<a.length();i++)
{
char spot1 = a.charAt(i);
            char previousChar = a.charAt(i - 1);
            if (previousChar == ' ') {
                res = res + Character.toUpperCase(spot1);
            } else {
                res = res + spot1;
            }
        }
        System.out.println(res);
    }
}
