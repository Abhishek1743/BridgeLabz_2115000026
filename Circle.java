import java.util.Scanner;
public class Circle{
    private double radius;

    // Default constructor
    public Circle(){
        this(1.0);
    }

    // Parameterized constructor
    public Circle(double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double circumference(){
        return 2 * Math.PI * radius;
    }

    public void displayInfo(){
        System.out.println("Radius : " +radius);
        System.out.println("Area : " +area());
        System.out.println("Circumference : " +circumference());
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Circle circle1 = new Circle();
        circle1.displayInfo();

        System.out.println("\nEnter a radius for a new circle: ");
        double userRadius = scanner.nextDouble();

        Circle circle2 = new Circle(userRadius);
        circle2.displayInfo();

        scanner.close();
    }
}
