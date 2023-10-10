/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0){ //for test cases
		    int X=sc.nextInt();//number of 5 rs coin
		    int Y=sc.nextInt();//number of 10 rs coin
		    int Z=sc.nextInt();//cost of choclate
		    int totalpaisa=X*5+Y*10;
		     int numofchoclate=totalpaisa/Z;
		     System.out.println(numofchoclate);
		}
	}
}
