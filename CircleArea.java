import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Please Enter your Radius");
        Scanner input = new Scanner(System.in);
        double Radius = input.nextDouble();
        if (Radius > 0) {
            Circle c1 = new Circle();
            c1.setRadius(Radius);
            System.out.println("Your area is "+ c1.getArea() + " given " + Radius + " radius");  
        }else{
            System.out.println("Radius must be greater than 0");
        }
       
    }
}
