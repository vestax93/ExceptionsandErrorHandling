import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> range = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.printf("Range: [%d...%d]%n", range.get(0), range.get(1));

        boolean isValid = false;

        while (!isValid) {
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);

                if (number < range.get(0) || number > range.get(1)) {
                    System.out.println("Invalid number: " + number);
                } else {
                    System.out.println("Valid number: " + number);
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
            }
        }
    }
}