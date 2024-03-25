import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        int num = 1;
//        while(num <= 10){
//            System.out.print(num + " ");
//            num += 1;
//        }
//        System.out.println("\n\n");
//
//        int num2 = 500;
//        while(num2 >= 200){
//            System.out.print(num2 + " ");
//            num2 -= 1;
//        }

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while(i <= 5){
            System.out.print("Enter number " + i + ": ");
            int input = scanner.nextInt();
            System.out.println("Number is: " + input);
            i++;
        }
    }
}
