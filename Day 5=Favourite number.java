import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int A = sc.nextInt(); // The number A in this test case
            String winner = findWinner(A);
            System.out.println(winner);
        }
        sc.close();
    }

    public static String findWinner(int A) {
        if (A % 2 == 0 && A % 7 == 0) {
            return "Alice";
        } else if (A % 2 != 0 && A % 9 == 0) {
            return "Bob";
        } else {
            return "Charlie";
        }
    }
}
