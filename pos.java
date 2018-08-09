/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int p;
	System.out.println("enter a value");
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
	
	if(p<0)
	{
		System.out.println("negative");
	}
	else if(p>0)
	{
		System.out.println("positive");
	}
	else
	{
		System.out.println("Zero");
	}
	}
}
