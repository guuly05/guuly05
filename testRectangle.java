package assigments;

import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}


