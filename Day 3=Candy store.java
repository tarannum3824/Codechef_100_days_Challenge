/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt(); // Daily goal
            int Y = sc.nextInt(); // Chocolates sold

            int totalAmount = 0;
            if (Y <= X) {
                totalAmount = Y;
            } else {
                totalAmount = X + 2 * (Y - X);
            }
            
            System.out.println(totalAmount);
        }
	}
}
