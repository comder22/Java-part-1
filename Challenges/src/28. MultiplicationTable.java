import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        int number = userInput();
        Table(number);
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        return scanner.nextInt();
    }
    public static void Table(int num){
        int i = 1;
        int product = num;
        while(i <= 10){
            product = num*i;
            System.out.println(num + " x " + i +" = " + product);
            i++;
        }
    }
}
