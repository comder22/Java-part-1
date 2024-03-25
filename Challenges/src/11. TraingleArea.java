import java.util.Scanner;

class TraingleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = (float)1/2*(base*height);
//        double area = (base*height)/2;
        System.out.println("Area of the triangle is: " + area);
    }
}
