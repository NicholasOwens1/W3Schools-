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

    static double compute() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
        return 0;
    }

    static double formuoli() {
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        return 0;
    }

    static double ravioli() {
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        return 0;
    }

    static String circle(double radius) {
        double perimeter = radius * 2 * Math.PI;
        double area = Math.pow(radius, 2)  * Math.PI;
        return String.format("Perimeter = %f \nArea = %f", perimeter, area);
    }

    static double average(double num1, double num2, double num3){
        return (num1+num2+num3) / 3;
    }

    static String rectangle(double width, double height) {
        double perimeter = (width * 2)  + (height * 2);
        double area = width * height;
        return String.format("Perimeter = %f \nArea = %f", perimeter, area);
    }

    static String merica(){
        for(int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ==================================\n" +
                    " * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");
        for(int i = 0; i < 6; i++){
            System.out.println("==============================================");
        }
        return "";
    }

    static String change(int input1, int input2) {
        int num = input1;
        input1 = input2;
        input2 = num;
        System.out.println(input1);
        System.out.println(input2);
        return "";
    }

    static String face(){
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
        return "";
    }

    static String binarysum(String num1, String num2) {
        int sum = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);
        String answer = Integer.toBinaryString(sum);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(binarysum("10","11"));

    }


}