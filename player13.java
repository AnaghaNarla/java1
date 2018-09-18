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
		 Scanner input= new Scanner(System.in);
  int number = input.nextInt();
  int n1=0,n2=0;
    while(number!=0)
    {
    n1=number%10;
    n2+=n1*n1;
    number/=10;
    }
   System.out.println(n2);
	}
}
