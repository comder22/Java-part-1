import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println("Addition: " + (x+y));
        System.out.println("Subtraction: " + (x-y));
        System.out.println("Multiplication: " + (x*y));
        System.out.println("Division: " + (x/y));
        System.out.println("Modulo: " + (x%y));


    }
}
