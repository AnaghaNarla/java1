/* package whatever; // don't place package name! */

import java.util.Scanner;
 class Binary_Octal
 {
                 Scanner scan;
	int num;
	void getVal() 
	{
                   
	    scan = new Scanner(System.in);
	    num = Integer.parseInt(scan.nextLine(), 2);
	}
	void convert() 
	{
	        String octal = Integer.toOctalString(num);
	       System.out.println( octal);
	}
 }
class Main_Class
{
  public static void main(String[] args) 
    {
        Binary_Octal obj = new Binary_Octal();
        obj.getVal();
        obj.convert();
   }
}
