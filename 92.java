/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int n,sum=0,i=0;                
                  Scanner sc=new Scanner(System.in);
                  n=sc.nextInt();
                  int a[]=new int[n]; 
                  while(i<n)
                   {      
                      a[i]=sc.nextInt();
	       sum+=a[i];    
	       i++;     
                    }
                 System.out.println(sum); 
	}
}
