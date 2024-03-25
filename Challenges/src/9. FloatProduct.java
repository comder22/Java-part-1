import java.util.Scanner;

class FloatProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first decimal number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second decimal number: ");
        double y = scanner.nextDouble();

        double product = x*y;
        System.out.println("Product of the two numbers is: " + product);
    }
}
