import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Now enter the value of y: ");
        int y = scanner.nextInt();

        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping x: "+x+" and y: "+y);
    }
}
