import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        int a = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dedo: ");

        int x1 = scanner.nextInt();
        a += x1;
        System.out.println("new a is "+a);

        int x2 = scanner.nextInt();
        a += x2;
        System.out.println("new a is "+a);

        int x3 = scanner.nextInt();
        a += x3;
        System.out.println("new a is "+a);

        int x4 = scanner.nextInt();
        a += x4;
        System.out.println("new a is "+a);

    }
}
