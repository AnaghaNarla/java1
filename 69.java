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
		int N,M,P;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		P=N-M;
		if(P%2==0)
		{
			System.out.println("even");
	
		}
		else
		{
			System.out.println("odd");
		}
	}
}
