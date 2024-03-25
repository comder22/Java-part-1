import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter side B: ");
        double B = scanner.nextDouble();
        System.out.print("Enter side C: ");
        double C = scanner.nextDouble();
        System.out.print("Enter side D: ");
        double D = scanner.nextDouble();

        double perimeter = A + B + C + D;
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
}
