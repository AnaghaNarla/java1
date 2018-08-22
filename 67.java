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
		int num,n,m,m1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<=10)
		{
			System.out.println("10");
		}
		else
		{
			m=num/10;
			m1=(m+1)*10;
			System.out.println(m1);
		}
	}
}
