import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for driver's license");
        }
        else{
            System.out.println("You are under age");
        }
    }
}
