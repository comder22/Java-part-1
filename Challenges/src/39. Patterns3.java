import java.util.Scanner;

class Patterns3 {
    public static void main(String[] args) {
        int number = userInput();
        rightHalfPyramid(number);
        System.out.println("\n");
        reverseRightHalfPyramid(number);
        System.out.println("\n");
        leftHalfPyramid(number);
        System.out.println("\n");
    }
    public static void rightHalfPyramid(int num){
        int row = 1;
        while(row <= num){
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println("1. Right half pyramid");
    }
    public static void reverseRightHalfPyramid(int num){
        int row = num;
        while(row >= 1){
            int col = row;
            while(col >= 1){
                System.out.print("* ");
                col--;
            }
            System.out.println();
            row--;
        }
        System.out.println("2. Reverse right half pyramid");
    }
    public static void leftHalfPyramid(int num){
        int row = 1;
        while(row <= num){
            int space = num - row;
            while(space >= 1){
                System.out.print("  ");
                space--;
            }
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println("3. Left half pyramid");
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
}
