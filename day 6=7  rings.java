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
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of items
            int x = sc.nextInt(); // Cost per item
            int totalBill = n * x; // Calculate the total bill

            if (isPhoneNumber(totalBill)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    // Function to check if a number is a valid phone number
    public static boolean isPhoneNumber(int number) {
        return number >= 10000 && number <= 99999;
	}
}
