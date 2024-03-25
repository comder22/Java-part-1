import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int num = userInput();

        if(isPalindrome(num)){
            System.out.println(num + " is a Palindrome");
        }
        else{
            System.out.println("Nahi h ye waala");
        }
    }
    public static boolean isPalindrome(int number){
       return reverseNumber(number) == number;
    }
    public static int reverseNumber(int number){
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum = sum * 10 + digit;
            number /= 10;
        }
        return sum;
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
}
