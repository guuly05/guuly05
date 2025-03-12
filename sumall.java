package assigments;
import java.util.*;
public class sumall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter start: ");
        int i = scanner.nextInt();
        System.out.println("enter end: ");
        int x = scanner.nextInt();
        while (i <= x){
            if (i % 2 == 0){
                sum += i;

            }
            i++;

        }
        System.out.println(sum);
    }
}
