import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal Amount ₹");
        int principal = scanner.nextInt();
        System.out.print("Enter the Interest Rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Enter the Time Period: ");
        float time = scanner.nextFloat();

        float simpleInt = (principal*rate*time)/100;
        System.out.println("The simple interest is ₹" + simpleInt);
    }
}
