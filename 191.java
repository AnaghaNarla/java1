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
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i,j,res=0,res2=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					res=res+1;
				}
				else
				{
					res2++;
				}
			}
		}
		if(res==n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
