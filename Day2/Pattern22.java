import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2 * n - 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int top = i;
                int left = j;
                int bottom = size - i + 1;
                int right = size - j + 1;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - min + 1));
            }
            System.out.println();
        }
    }
}

