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
		Scanner s=new Scanner(System.in);
		String p=s.next();
		boolean numeric=true;
		try
		{
			Double num=Double.parseDouble(p);
		}
		catch(NumberFormatException e)
		{
			numeric=false;
		}
		if(numeric)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
