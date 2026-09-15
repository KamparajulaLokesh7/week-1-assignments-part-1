import java.util.Scanner;

public class SkipMultiplesOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    continue;
                }

                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
