import java.util.*;

public class prog2 {

    int[] numb = new int[10];
    int sum;

    public void inumm() {
        for (int i = 0; i < numb.length; i++) {
            numb[i] = i;
            System.out.print(numb[i] + " ");
        }
        System.out.println();
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = numb.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = numb[i];
            numb[i] = numb[j];
            numb[j] = temp;
        }
    }

    public void calc() {
        sum = 0;
        for (int number : numb) {
            sum += number;
        }
    }

    public double calavg() {
        if (numb.length == 0) {
            return 0;
        }
        return (double) sum / numb.length;
    }

    public void print() {
        double avg = calavg();
        System.out.println("Avg is " + avg);
    }

    public static void main(String[] args) {
        prog2 p = new prog2();

        System.out.println("Before shuffle:");
        p.inumm();

        p.shuffle();

        System.out.println("After shuffle:");
        for (int num : p.numb) {
            System.out.print(num + " ");
        }
        System.out.println();

        p.calc();
        p.print();
    }
}
