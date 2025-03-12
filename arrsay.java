package assigments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrsay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] x = new int[5] ;
        int maxi = 0;
        for (int i =0; i < x.length; i++){
            System.out.println("enter array value: ");
            x[i] = scanner.nextInt();

        }
        int cali = 0;

        for (int i = 0; x[i] < maxi; i++ ) {
            if (x[i] < maxi) {
                x[i] = maxi;
                cali = i;

            }
        }
            System.out.println(maxi);

    }
}
