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
		int a,b,c,suf=0,vol=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		suf=2*a*b+2*b*c+2*c*a;
		vol=a*b*c;
		System.out.println(suf+" "+vol);
		
	}
}
