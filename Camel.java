
import java.io.IOException;
import java.util.*;
public class Camel
{
public static void main(String args[])throws IOException

{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a sentence");
String a=sc.nextLine();
String result= "";

char first =a.charAt(0);

result = result + Character.toUpperCase(first);
for(int i=1;i<a.length();i++)
{
char spot1= a.charAt(i);
            char preChar = a.charAt(i - 1);
            if (preChar == ' ') {
                result = result + Character.toUpperCase(spot1);
            } else {
                result = result + spot1;
            }
        }
        System.out.println(result);
    }
}
