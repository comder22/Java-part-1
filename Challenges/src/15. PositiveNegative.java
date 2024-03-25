import java.util.Scanner;

class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Number is +ve");
        }
        else if(num < 0){
            System.out.println("Number is -ve");
        }
        else{
            System.out.println("Zero");
        }
    }
}
