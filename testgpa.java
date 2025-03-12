package gpacalculation;
import java.util.*;
class testgpa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gpacalc gpa = new gpacalc();

        System.out.println("Hello student! Please enter your name:");
        gpa.name = scanner.nextLine();

        System.out.println("Okay " + gpa.name + ", what is your bachelor's degree program?");
        gpa.course = scanner.nextLine();

        System.out.println("Okay " + gpa.name + ", please enter your ID:");
        gpa.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Now let's enter your courses and grades.");
        for (int i = 0; i < gpa.grades.length; i++) {
            System.out.println("Enter the name of course " + (i + 1) + " followed by the grade (separated by a comma):");
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            if (parts.length == 2) {
                gpa.coursename[i] = parts[0].trim();
                gpa.grades[i] = Double.parseDouble(parts[1].trim());
            } else {
                System.out.println("Invalid input. Please enter in the format: CourseName, Grade");
                i--;
            }
        }

        gpa.calculateGPA();
        gpa.printinfo();
    }
}