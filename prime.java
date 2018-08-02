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
		int i,d;
		System.out.println("Enter value");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		d=i;
		if(i%1==0&&i%d==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
