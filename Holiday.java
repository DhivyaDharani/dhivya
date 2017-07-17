import java.util.*;
import java.io.*;

public class Holiday {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day you want to check");
		String s=sc.next();
		String defalt="Sunday";
		if(s.equalsIgnoreCase(defalt))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
