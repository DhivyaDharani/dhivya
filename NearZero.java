import java.util.*;
import java.io.*;
public class NearZero
{
	public static void main(String[] args) {
	
          int sum=0;
          Scanner ss=new Scanner(System.in);
          int m = ss.nextInt();
          int a[]=new int[m];
          for(int i=0;i<m;i++){
        	  a[i]=ss.nextInt();
          }for(int j=0;j<m;j++){
        	 
        	   if((a[j]>=-2)&&(a[j]<=1)){
        		   System.out.println(a[j]);
        	   }
          }
          
          }
          
	

}
