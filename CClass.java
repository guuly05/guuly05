import java.util.Scanner;

public class CClass {
    public static void main(String[] args) {

        System.out.println("enter gpa");
        Scanner scanner = new Scanner(System.in);
        student stud = new student();
        stud.gpa = scanner.nextDouble();
        System.out.println("enter your idi");
        stud.id = scanner.nextInt();
        System.out.println("enter the name ");
        stud.name = scanner.next();
        stud.displayinfo();



    }
}
