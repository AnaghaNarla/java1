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
		int n,r,palin,sum=0;
		System.out.println("Enter a value:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		palin=n;
		while(n!=0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==palin)
		{
			System.out.println("Yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}
}
