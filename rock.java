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
		System.out.println("enter the 2 player names");
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		System.out.println(s1+" "+s2);
		int n=s.nextInt();
		System.out.println("Enter the First player choice");
		switch(n)
		{
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Scicessor");
				break;
			case 3:
				System.out.println("paper");
				break;
		}
		System.out.println("Enter second player choice");
		switch(n)
		{
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Scicessor");
				break;
			case 3:
				System.out.println("paper");
				break;
		}
		
		
		
	}
}
