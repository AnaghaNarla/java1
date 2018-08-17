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
		Scanner s= new Scanner(System.in);
		int number=s.nextInt();
		s.close();
		if(isPowerOfTwo(number))
		{
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}
	}
	private static boolean isPowerOfTwo(int number)
	{
		if(number<=0)
		{
			return false;
		}
		while(number>1)
		{
			if(number%2!=0)
			{
				return false;
			}
			number=number/2;
		}
		return true;
		
	
	}
}
