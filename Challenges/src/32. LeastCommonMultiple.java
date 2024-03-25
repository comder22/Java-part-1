import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
    int num1 = userInput();
    int num2 = userInput();

        System.out.println("The lcm of " + num1 + " & " + num2 +" is: " + lcm2(num1, num2));
    }
    public static int lcm1(int number1, int number2){
        int lcm = 1;
        while(true){
            if(lcm % number1 == 0 && lcm % number2 == 0){
                return lcm;
            }
            else{
                lcm++;
            }
        }
    }
    public static int lcm2(int number1, int number2){
        int lcm = number1;
        int i = 2;
        while(true){
            if(lcm % number1 == 0 && lcm % number2 == 0){
                return lcm;
            }
            else{
                lcm = number1 * i;
                i++;
            }
        }
    }
    public static int userInput(){
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
