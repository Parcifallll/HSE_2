import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, world!");
        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println("Enter a number:");
        int b = scanner.nextInt();
        int c = a - b;
        scanner.close();
        System.out.printf("%d - %d = %d", a, b, c);

    }
}
