import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][3];
        arr1[0][0] = 9;

        int[][] arr = {{1,2,3}, {4,5}, {7,8,9}};
//        System.out.println(arr.length);
        print2DArr(arr);
    }
//    Traversal of 2D Array
    public static void print2DArr(int[][] arr){
        int row = 0;
        while(row < arr.length){
            int col = 0;
            while(col < arr[row].length){
                System.out.print(arr[row][col] + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        return scanner.nextInt();
    }
}
