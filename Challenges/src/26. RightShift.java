import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int result = num >> 1;
        System.out.println("Right shift of "+num+" is: "+result);
    }
}
