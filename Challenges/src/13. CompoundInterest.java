import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount ₹");
        int principal = scanner.nextInt();
        System.out.print("Enter the interest rate: ");
        float rate = scanner.nextFloat();
        System.out.print("Enter the time period: ");
        float time = scanner.nextFloat();

        double compoundInterest = principal * Math.pow((1+rate/100), time);
        System.out.println("The compound interest is ₹" + compoundInterest);
    }
}
