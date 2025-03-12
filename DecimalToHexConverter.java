package assigments;

import java.util.Scanner;

public class DecimalToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        if (decimal < 0) {
            System.out.println("Negative numbers are not supported.");
        } else {
            System.out.println("Hexadecimal: " + decimalToHex(decimal));
        }
    }


    public static String decimalToHex(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16;
            char hexChar = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            hex.insert(0, hexChar);
            decimal /= 16;
        }
        return hex.toString();
    }
}
