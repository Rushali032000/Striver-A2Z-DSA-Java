import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= n - i + 1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2*(i - 1); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= n - i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2*(n - i); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
