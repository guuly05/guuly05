package assigments;

import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter #");
        int x = scanner.nextInt();
        for(int i=1; i<= 10; i++){
            int sum = x * i;
            System.out.println(x + "*" + i + "=" + sum );
        }
    }
}
