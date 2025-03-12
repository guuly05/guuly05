package assigments;
import java.util.*;
public class radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius");
        double radius = scanner.nextDouble();
        while (radius < 0){
            System.out.println("enter a valid number");
            radius = scanner.nextDouble();

        }
        double area = radius*radius*3.14;
        System.out.println("area is " + area);
    }
}
