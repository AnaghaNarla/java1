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
		int num,p,r,sum=0;
		System.out.println("Enter value");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		p=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
			
		}
		if(sum==p)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
