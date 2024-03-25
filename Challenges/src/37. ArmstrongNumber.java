import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int num = userInput();
//        boolean finalResult = armstrong(num);

        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println("Nhi h ye waala");
        }
    }
    public static boolean isArmstrong(int number3){
        if(number3 == calculation(number3)){
            return true;
        }
        return false;
    }
    public static int numCount(int number1){
        int count = 0;
        while(number1 > 0){
            number1 /= 10;
            count++;
        }
        System.out.println("1. Number count is: " + count);
        return count;
    }
    public static int calculation(int number2){
        int countStatic = numCount(number2);
        int sum = 0;
        while(number2 > 0){
            int digit = number2 % 10;
            sum += power(digit, countStatic);
            number2 /= 10;
        }
        System.out.println("3. Armstrong sum is: " + sum);
        return sum;
    }
    public static int power(int digit, int count){
        int product = 1;
        while(count > 0){
            product *= digit;
            count--;
        }
        System.out.println("2. Power of " + digit + " is: " + product);
        return product;
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
}
