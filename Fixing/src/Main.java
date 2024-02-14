import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] weekdays = new String[5];

        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";
        weekdays[2] = "Wednesday";
        weekdays[3] = "Thursday";
        weekdays[4] = "Friday";

        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }

        for (int i = 0; i <= weekdays.length - 1; i++) {
            System.out.println(weekdays[i]);
        }
    }
}