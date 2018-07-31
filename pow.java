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
		int base,exp;
		long res=1;
		System.out.println("enter base and exponent values");
		Scanner s=new Scanner(System.in);
		base=s.nextInt();
		exp=s.nextInt();
		while(exp!=0)
		{
			res*=base;
			exp--;
		}
		System.out.println("power is" +res);
	}
}
