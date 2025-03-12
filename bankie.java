import java.util.*;
public class bankie {
   private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    bankie(){
   }
   double getarea(double radius ){
       return radius*radius*3.14;
   }


    public static void main(String[] args) {

    Scanner scanner =  new Scanner(System.in);
        System.out.println("enter radius");
        bankie b1 = new bankie();
        b1.radius = scanner.nextDouble();
        System.out.println(" your area is " + b1.getarea(b1.radius));


    }
}
