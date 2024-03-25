import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        int num = userInput();
        System.out.println("Sum of odd numbers from 1 to " + num + " is: " + oddSum(num));
    }

    public static int userInput(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the value of N: ");
        return scanner.nextInt();
    }

    public static int oddSum(int number){
        int i = 1;
        int sum = 0;
        while(i <= number){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
