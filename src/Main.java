import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text:");

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();

        System.out.println("Output text:");

        System.out.println(thirdInput);
        System.out.println(secondInput);
        System.out.println(firstInput);
    }
}