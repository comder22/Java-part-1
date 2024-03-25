import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1 = inputNum();
        int num2 = inputNum();

        int result = addNum(num1, num2);
        System.out.println("The sum of both the numbers is: " + result);
    }

    public static int addNum(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
    public static int inputNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();
        return num;
    }
    public static void greet() {
        System.out.println("Welcome to Calculator");
    }

}
