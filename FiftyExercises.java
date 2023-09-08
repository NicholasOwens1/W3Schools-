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

    static int divide() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num1/num2;
    }

    static int problems() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);
        return 0;
    }

    static String multiply() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = num1*num2;
        return String.format("%d + %d = %d", num1, num2, product);
    }

//    static int options() {
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int
//        System.out.println("%d + %d = %d", num1, num2, num1+num2);
//    }

    public static void main(String[] args) {
        System.out.println(multiply());
    }

}
