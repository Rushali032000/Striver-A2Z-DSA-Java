import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <= n - row - 1; space++) {
                System.out.print(" ");
            }
            for(int star = 1; star <= (2*row-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i = 1; i <= n; i++){
            for(int space = 1; space <= i - 1; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= (2*(n - i) + 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}



