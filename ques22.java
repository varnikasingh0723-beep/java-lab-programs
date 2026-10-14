import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        if (l > 0 && l == b)
            System.out.println("It is a Square");
        else
            System.out.println("It is not a Square");

        sc.close();
    }
}
