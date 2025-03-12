package assigments;
import java.util.*;

public class calci {

    public void printinfo(){
        System.out.println("****************************");
        System.out.println("1. Area of Circle");
        System.out.println("2. Simple Calculator");
        System.out.println("3. Max and Min");
        System.out.println("4. Round, Ceiling, and Floor");
        System.out.println("5. Check if Positive/Negative/Zero");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        System.out.println("****************************");
    }
    public void findMaxAndMin(int a, int b, int c, int d) {
        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        int max = Math.max(max1, max2);

        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        int min = Math.min(min1, min2);

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }

    public void roundCeilingFloor() {
        double num1 = 12.34;
        double num2 = -5.67;
        double num3 = 8.91;

        System.out.println("Rounded num1: " + Math.round(num1));
        System.out.println("Ceiling num2: " + Math.ceil(num2));
        System.out.println("Floor num3: " + Math.floor(num3));
    }

    public void checkSign(double value) {
        double sign = Math.signum(value);

        if (sign > 0) {
            System.out.println(value + " is positive");
        } else if (sign < 0) {
            System.out.println(value + " is negative");
        } else {
            System.out.println(value + " is zero");
        }
    }
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public double round(double num) {
        return Math.round(num);
    }

    public double ceiling(double num) {
        return Math.ceil(num);
    }

    public double floor(double num) {
        return Math.floor(num);
    }
    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");
        }
    }
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public int calculate(int firstNumber, int secondNumber, int operation) {
        switch (operation) {
            case 1:
                return Math.addExact(firstNumber, secondNumber);
            case 2:
                return Math.subtractExact(firstNumber, secondNumber);
            case 3:
                return Math.multiplyExact(firstNumber, secondNumber);
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                return Math.floorDiv(firstNumber, secondNumber);
            case 5:
                if (secondNumber == 0) {
                    System.out.println("Error: Modulo by zero");
                    return 0;
                }
                return Math.floorMod(firstNumber, secondNumber);
            default:
                System.out.println("Invalid operation choice");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calci c = new calci();
        int choice;
        while(true) {
            c.printinfo();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    double area = c.calculateCircleArea(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int secondNumber = scanner.nextInt();

                    System.out.println("\nCalculator Menu:");
                    System.out.println("1. Add (+)");
                    System.out.println("2. Subtract (-)");
                    System.out.println("3. Multiply (*)");
                    System.out.println("4. Divide (/)");
                    System.out.println("5. Remainder (%)");
                    System.out.print("Enter your operation choice: ");

                    int operationChoice = scanner.nextInt();
                    int result = c.calculate(firstNumber, secondNumber, operationChoice);
                    System.out.println("The result is: " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    System.out.print("Enter the third number: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Enter the fourth number: ");
                    int num4 = scanner.nextInt();
                    c.findMaxAndMin(num1, num2, num3, num4);
                    break;
                case 4:
                    c.roundCeilingFloor();
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    double numberToCheck = scanner.nextDouble();
                    c.checkSign(numberToCheck);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }



        }
    }
}
