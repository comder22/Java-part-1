import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        int arrLength = arr.length;
        int num = usrInput();

        if(isPresent(arr, num)){
            System.out.println(num + " is present");
        }
        else{
            System.out.println("hai hi nhi bc");
        }

    }
    public static boolean isPresent(int[] arr, int num){
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                return true;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static int usrInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
}



