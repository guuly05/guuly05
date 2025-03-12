import java.util.Scanner;

public class malika {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        if ((a | b) > (b & c)) {
            if ((b ^= a) > c) {
                if ((c |= b) > 10) {
                    System.out.println("Path 1");
                } else {
                    System.out.println("Path 2");
                }
            } else {
                System.out.println("Path 3");
            }
        } else if ((a & c) < (b | c)) {
            System.out.println("Path 4");
        } else {
            System.out.println("Path 5");
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
