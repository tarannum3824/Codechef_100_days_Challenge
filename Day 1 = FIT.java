/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the distance to Chef's office for this test case
            int X = sc.nextInt();

            // Calculate the total distance Chef travels in a week for this test case
            int totalDistanceInAWeek = 2 * X * 5; // 2 times the distance for round trip on 5 working days

            // Print the result for this test case
            System.out.println(totalDistanceInAWeek);
        }

        // Close the scanner
        sc.close();
	}
}
