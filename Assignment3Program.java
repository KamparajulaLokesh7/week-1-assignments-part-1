import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid mark.");
        } else if (marks >= 90) {
            System.out.println("You have got grade A.");
        } else if (marks >= 80) {
            System.out.println("You have got grade B.");
        } else if (marks >= 70) {
            System.out.println("You have got grade C.");
        } else if (marks >= 60) {
            System.out.println("You have got grade D.");
        } else {
            System.out.println("You have got grade F.");
        }

        sc.close();
    }
}
