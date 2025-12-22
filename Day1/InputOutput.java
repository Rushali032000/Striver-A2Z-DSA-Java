import java.util.Scanner;

class InputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int n = sc.nextInt();
        System.out.print("Your number is " + n);
        sc.close();
    }
}