/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i;
	System.out.println("enter i value");
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	
	
	if(i<0)
	{
		System.out.println("negative");
	}
	else if(i>0)
	{
		System.out.println("positive");
	}
	else
	{
		System.out.println("Zero");
	}
	}
}
