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
        return num1 / num2;
    }

    static int problems() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        return 0;
    }

    static String multiply() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        return String.format("%d * %d = %d", num1, num2, product);
    }

    static String options() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        return String.format(
                "%d + %d = %d \n" +
                        "%d - %d = %d\n" +
                        "%d * %d = %d\n" +
                        "%d / %d = %d\n" +
                        "%d mod %d = %d",
                num1, num2, sum,
                num1, num2, difference,
                num1, num2, product,
                num1, num2, quotient,
                num1, num2, remainder);
    }

    static String multiples() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
//        Loop 10 times, multiply the given number by each number from 1 to 10. Use String.format to type less code.
        for (int i = 0; i <= 10; i++) {
            int product = num * i;
            System.out.printf("%d * %d = %d%n", num, i, product);
        }
        return "";
    }

    static String java() {
        System.out.println("   J    a   v     v  a     ");
        System.out.println("   J   a a   v   v  a a      ");
        System.out.println("J  J  aaaaa   V V  aaaaa      ");
        System.out.println(" JJ  a     a   V  a     a");
        return "";
    }


    public static void main(String[] args) {
        java();
    }

}
