import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int num = userInput();
        System.out.println("Factorial of "+ num + " is: " + factorial(num));
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        return scanner.nextInt();
    }

    public static long factorial(int number){
        if(number < 2){
            return 1;
        }

        long product = 1;
        int i = 2;
        while(i <= number){
            product *= i;
            i++;
        }
        return product;
    }
}
