import java.util.Scanner;

class DigitSum {
    public static void main(String[] args) {
        int num = userInput();
        System.out.println("Sum of the digits of " + num + " is: " + digitSum(num));
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        return scanner.nextInt();
    }
    public static int digitSum(int number){
        int sum = 0;
        while(number>0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
