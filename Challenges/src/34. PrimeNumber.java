import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        int input = userInput();
        print(input);

    }
    public static void print(int num){
        if(isPrime(num)){
            System.out.println(num + " is a prime number!");
        }
        else {
            System.out.println("Not a prime number, period");
        }
    }
    public static boolean isPrime(int number){
        int i = 2;
        while(i < number){
            if(number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
}
