import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int space = 1; space <= n-i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(int k = 1; k < i; k++){
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }    
        
    }
}
