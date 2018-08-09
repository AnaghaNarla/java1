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
		int p,temp,i,j;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		int a[]=new int[p];
		for(i=0;i<p;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<p;i++)
		{
			for(j=i+1;j<p;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}
		}
		for(i=0;i<p;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		
	}
}
