import java.util.Scanner;

class BitwiseNOT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        int result = ~num;
        System.out.println("NOT(~) of the number is: " + result);
    }
}
