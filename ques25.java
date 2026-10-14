import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (&, |, !): ");
        char op = sc.next().charAt(0);

        boolean x = a != 0;
        boolean y = b != 0;

        if (op == '&')
            System.out.println("Result: " + (x && y));
        else if (op == '|')
            System.out.println("Result: " + (x || y));
        else if (op == '!')
            System.out.println("Result: " + (!x));
        else
            System.out.println("Invalid Operator");

        sc.close();
    }
}
