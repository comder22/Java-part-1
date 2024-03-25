import java.util.Scanner;

class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahren = scanner.nextFloat();

        float celsius = (fahren-32)*(float)5/9;
        System.out.println("The temperature in Celsius is: "+ celsius);
    }
}
