import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int result = num << 4;
        System.out.println("Left shift of " + num + " is: " + result);
    }
}
