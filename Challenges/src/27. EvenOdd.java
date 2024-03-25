import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if((num & 1) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }
}
