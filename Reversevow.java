import java.util.*;
import java.io.*;

public class Reversevow {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str=str1.replaceAll("a","");
		str=str.replaceAll("e","");str=str.replaceAll("i","");str=str.replaceAll("o","");str=str.replaceAll("u","");
		
		StringBuffer str2=new StringBuffer(str);
		int n=str.length();
		str2=str2.reverse();

		System.out.println(str2);
		
	}

}
