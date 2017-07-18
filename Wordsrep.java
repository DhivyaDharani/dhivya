package guvicodekata;

import java.io.IOException;
import java.util.*;


public class Wordsrep{
        public static void main(String[] args)throws IOException{
            Scanner in=new Scanner(System.in);
            System.out.println("ENTER THE STRING");
            String str=in.next();
            int len=str.length();
            int i,j,count,len1=1;
            TreeMap<Integer,String>hm=new TreeMap<Integer,String>(); 
            for(i=0;i<len;i++)
            {
                count=0;
                for(j=i;j<len;j++)
                {
                   
                    if((str.substring(i,i+1) ).equals(str.substring(j,j+1)))
                    {
                        count++;
                    }
                    hm.put(count,(str.substring(i,i+1)));
                }
            }
           
            for(Map.Entry<Integer, String> obj: hm.entrySet())
            {
                if(len1==hm.size())
                System.out.println(obj.getValue()+" is greater letter of repeted at the string & it's repeted time of "+obj.getKey());
                len1++;
            }
           
           
        }}
