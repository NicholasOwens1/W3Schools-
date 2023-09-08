import java.util.Scanner;

public class FiftyExercises {

    static String hello() {
//        use String.format to put the given name into the string.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        return String.format("Hello \n%s", name);
    }

    public static void main(String[] args) {
        System.out.println(hello());
    }

}
