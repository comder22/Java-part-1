import java.util.Scanner;

class GreatestOfThree {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greatest number is: " + num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("The greatest number is: " + num2);
        }
        else{
            System.out.println("The greatest number is: " + num3);
        }
    }
}
