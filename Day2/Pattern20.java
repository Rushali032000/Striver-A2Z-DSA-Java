import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row <= n ? row : 2 * n - row;
            int spaces = row <= n ? 2 * (n - row) - 1 : 2 * (row - n) - 1;
            for (int s = 1; s <= stars; s++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= spaces; sp++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

