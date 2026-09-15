import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("The number is zero.");
        } else if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            if (num % 2 == 0) {
                System.out.println("The number is negative and even.");
            } else {
                System.out.println("The number is negative and odd.");
            }
        }

        sc.close();
    }
}
