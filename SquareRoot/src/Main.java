import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = Integer.parseInt(scanner.nextLine());
            double squareRoot = Math.sqrt(num);

            if (num < 0 || Double.isInfinite(squareRoot) || Double.isNaN(squareRoot)) {
                System.out.println("Invalid");
            } else {
                System.out.printf("%.2f%n", squareRoot);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}