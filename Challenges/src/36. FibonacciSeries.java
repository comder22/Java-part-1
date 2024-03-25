import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        int target = userInput();
        fibonacci(target);
    }
    public static void fibonacci(int target){
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        if(target < 0) return;
        else if(target >= 0){
            System.out.print(num1 + " ");
        }
        while(num3 <= target){
//            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target: ");
        return scanner.nextInt();
    }
}
