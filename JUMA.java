
import java.util.Scanner;

public class JUMA {

    public static String calculateGrade(int score) {

        if (score < 0 || score > 100) {
            return "Invalid score";
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's score: ");
        int score = input.nextInt();

        String grade = calculateGrade(score);

        System.out.println("Student's grade: " + grade);

        input.close();
    }
}
