import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        cir22 cir = new cir22();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius");
        cir.radius = scanner.nextDouble();
        System.out.println(cir.radius * cir.radius * cir.pi);
    }
}
