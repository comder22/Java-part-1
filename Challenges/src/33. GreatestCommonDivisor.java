import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1 = userInput();
        int num2 = userInput();

        System.out.println("GCD or HCF of " + num1 + " & " + num2 + " is: " + highestCommonFactor(num1, num2));
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
    public static int highestCommonFactor(int number1, int number2){
        int i = number1;
        while(true){
            if(number1 % i == 0 && number2 % i == 0){
                return i;
            }
            else{
                i--;
            }
        }
    }
}
