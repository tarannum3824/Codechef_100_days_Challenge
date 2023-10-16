/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);

        // Read the number of stoves (X) and the number of minutes (Y)
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Calculate the total number of packets that can be cooked
        int totalPacketsCooked = X * Y;

        // Output the maximum number of customers Chef can serve
        System.out.println(totalPacketsCooked);
	}
}
