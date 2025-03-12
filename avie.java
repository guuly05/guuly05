import java.util.*;
public class avie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter thy size of an array: ");
        int n = 0;

        int[] x = new int[5];
        for (int i: x){
            x[i]=scanner.nextInt();
            n+=x[i];
        }
        double avg =  (double)n/x.length;
        System.out.println(avg);

        for (int i : x){
            if (avg<x[i]){
                System.out.println(x[i]);
break;
            }else i++;

        }

    }
}
