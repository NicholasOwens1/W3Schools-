import java.sql.SQLOutput;
import java.util.Scanner;

public class FiftyExercises {

    static String hello() {
//        Open a scanner object, use String.format to put the given name into the string.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return String.format("Hello \n%s", name);
    }

    static int sum() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1 + num2;
    }

    public static void main(String[] args) {

    }

}
