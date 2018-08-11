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
		int sum=0;
		Scanner s=new Scanner(System.in);
		String val=s.nextLine();
		int len=val.length();
		for(int i=0;i<len;i++)
		{
			if(val.charAt(i)==' ')
			{
				continue;
			}
			sum++;
			
		}
		System.out.println(sum);
	}
}
