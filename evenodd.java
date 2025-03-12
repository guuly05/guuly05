package assigments;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenSum = 0, oddSum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        if (evenSum > oddSum) {
            System.out.println("Even sum is greater: " + evenSum);
        } else if (oddSum > evenSum) {
            System.out.println("Odd sum is greater: " + oddSum);
        } else {
            System.out.println("Both sums are equal: " + evenSum);
        }
    }
}
