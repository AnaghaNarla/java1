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
		int n,p,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		p=sc.nextInt();
		d=sc.nextInt();
		System.out.println(n*(2*p+(n-1)*d)/2);
		
	}
}
