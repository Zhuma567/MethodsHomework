
import java.util.Scanner;

public class Juma2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int size = input.nextInt();

        System.out.println("Choose the pattern type:");
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");

        System.out.print("Your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else if (choice == 2) {

            for (int i = size; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } else if (choice == 3) {

            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } else if (choice == 4) {

            for (int i = size; i >= 1; i--) {
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}
