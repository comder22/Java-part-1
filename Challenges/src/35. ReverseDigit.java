import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        int num = userInput();
        System.out.println("Reverse of " + num + " is: " + reverseDigit(num));
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
    public static int reverseDigit(int number){
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
