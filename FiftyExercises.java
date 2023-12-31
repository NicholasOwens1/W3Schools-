import java.io.Console;
import java.nio.charset.Charset;
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

    static String binarySum(String num1, String num2) {
        int sum = Integer.parseInt(num1, 2) + Integer.parseInt(num2, 2);
        String answer = Integer.toBinaryString(sum);
        return answer;
    }

    static String binaryProduct(String num1, String num2) {
//      Turns both inputs into
        int product = Integer.parseInt(num1, 2) * Integer.parseInt(num2, 2);
        String answer = Integer.toBinaryString(product);
        return answer;
    }

    static String converter(int num) {
        String y = Integer.toBinaryString(num);
        return y;
    }

    static String hex(int num) {
        String y = Integer.toHexString(num);
        return y;
    }

    static String octal(int num) {
        String y = Integer.toOctalString(num);
        return y;
    }

    static String binaryToDecimal(String num) {
        int y = Integer.parseInt(num, 2);
        String z = Integer.toString(y);
        return z;
    }

    static String binaryToHexadecimal(String num) {
        int y = Integer.parseInt(num, 2);
        String z = Integer.toHexString(y);
        return z;
    }

    static String binaryToOctal(String num) {
        int y = Integer.parseInt(num, 2);
        String z = Integer.toOctalString(y);
        return z;
    }

    static String octalToDecimal(String num) {
        int y = Integer.parseInt(num, 8);
        String z = Integer.toString(y);
        return z;
    }

    static String octalToBinary(String num) {
        int y = Integer.parseInt(num, 8);
        String z = Integer.toBinaryString(y);
        return z;
    }

    static String octalToHex(String num) {
//        Octal to decimal
        int y = Integer.parseInt(num, 8);
//        Decimal to Hexadecimal
        String z = Integer.toHexString(y);
        return z;
    }

    static String hexToDecimal(String num) {
        int b = Integer.parseInt(num, 16);
        String z = Integer.toString(b);
        return z;
    }

    static String hexToBinary(String num) {
        int b = Integer.parseInt(num, 16);
        String z = Integer.toBinaryString(b);
        return z;
    }

    static String hextToOctal(String num) {
        int b = Integer.parseInt(num, 16);
        String z = Integer.toOctalString(b);
        return z;
    }

    static void javaChecker() {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java runtime version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java home: " + System.getProperty("java.home"));
        System.out.println("Java vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java class path: " + System.getProperty("java.class.path"));
        return;
    }

    static String compare(int num1, int num2) {
        if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2) ;
        }
        System.out.printf("%d != %d\n", num1, num2);

        if (num1 > num2){
            System.out.printf("%d > %d\n", num1, num2);
        }
        System.out.printf("%d < %d\n", num1, num2);

        if (num1 > num2){
            System.out.printf("%d >= %d", num1, num2);
        }
        System.out.printf("%d <= %d", num1, num2);
        return "";
    }

    static int sumOfDigits(int num) {
        String numString = Integer.toString(num);
//        split string into individual values
        String[] arr = numString.split("");
//        set a starting number
        int x = 0;
//      add up the numbers each placw in the array
        for (int i = 0; i < arr.length; i++) {
            x += Integer.parseInt(arr[i]);
        }
        return x;
    }

    static double hexArea(int side) {
//       declare a double with the value of the formula for hexagon area
        double area = (6 * Math.pow(side, 2)) / (4 * (Math.tan(Math.PI/6)));
        return area;
    }

    static double polygonArea(int sideNumber, int sideLength) {
        double area = (sideNumber * Math.pow(sideLength, 2)) / (4 * (Math.tan(Math.PI / sideNumber)));
        return area;
    }

    static double pointDistance(double lat1, double long1, double lat2, double long2) {
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);
        double distance = 6371.01 * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
        return distance;
    }
//    Distance between the two points [ (x1,y1) & (x2,y2)]
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//Radius of the earth r = 6371.01 Kilometers

    static String reverse(String input){
//        loop backwards outputting each character in the string
        String reversed = "";
        for (int i = input.length()-1; i >= 0; i--){
            char ch = input.charAt(i);
            reversed += ch;
        }
        return reversed;
    }

    static String count(String string){
//        Loop through the string checking the properties of each character,
//        create a counter for each char type. Increase the respective counter by 1
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;
        for (int i = 0; i < string.length(); i++) {
           char index = string.charAt(i);
            if (Character.isAlphabetic(string.charAt(i))) {
                letters += 1;
            }
            else if (String.valueOf(index).equals(" ")){
                spaces += 1;
            }
            else if (Character.isDigit(index)) {
                numbers += 1;
            }
            else other += 1;
        }
        return String.format("The number of letters is %s\n" +
                "The number of spaces is %s\n" +
                "The number of numbers is %s\n" +
                "The number of other characters is %s\n", letters, spaces, numbers, other);
    }

    public static String charsets() {
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
        return "";
    }

    public static int ascii(char input) {
        return (char) input;
    }

    public static String password(String password){
//        Declare console variable
        Console cons;
//    Check to see if system console is available
        if ((cons = System.console()) != null) {
            char[] pass_word = null;

            try {
                // Prompt user to input password
                pass_word = cons.readPassword("Enter Password");

                System.out.println("Your password is" + new String(pass_word));
            } finally {
                if (pass_word == null) {
                    java.util.Arrays.fill(pass_word, ' ');
                }
            }
        }

    return "";
    }



    public static void main(String[] args) {
        System.out.println(count( "njkn  oijio"));
    }
}