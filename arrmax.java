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
		int p,max;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[p];
		for(int i=0;i<p;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<p;i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
