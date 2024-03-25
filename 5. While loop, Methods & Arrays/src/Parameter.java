public class Parameter {
    public static void main(String[] args) {
        System.out.println("Sum of the two numbers is: " + sum(4, 7));
        System.out.println("Sum of the two numbers is: " + sum(5, 9));
        System.out.println("Sum of the two numbers is: " + sum(-67, 7));
    }
    public static int sum(int num1, int num2){
        System.out.println("First number received: " + num1);
        System.out.println("Second number received: " + num2);
        return num1 + num2;
    }
}
