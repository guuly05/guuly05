import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int counter = 0;
        int result = 1;

        while (counter < 3) {
            counter = Math.incrementExact(counter);
            result = Math.multiplyExact(result, num);
        }

        // Fix method name
        result = Math.decrementExact(Math.decrementExact(result));

        System.out.println("Result: " + result);
    }
}