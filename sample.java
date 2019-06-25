package sreeram;

import java.util.*;
class sample
{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String c="";
        for(int i=0;i<a.length();i++)
        {
        	if(c.contains(String.valueOf(a.charAt(i))))
        	{
        		break;
        	}
        	else
        	{
        		c=c+String.valueOf(a.charAt(i));
        	}
        }
        System.out.print(c.length());
    }
}