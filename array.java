/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Integer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n[]={1,2,3,4,5},k=2,i;
		int sum=0;
		for(i=0;i<k;i++)
		{
			sum=sum+n[i];
		}
		System.out.println("sum is"+sum);
	}
}
