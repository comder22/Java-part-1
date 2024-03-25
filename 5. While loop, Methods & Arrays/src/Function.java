public class Function {
    public static void main(String[] args) {
//    greeting();
    pattern1();
//    pattern2();
//    pattern3();
    }

    public static void pattern3() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
    public static void pattern2(){
        System.out.println("* * * * * ");
        System.out.println("* * * * ");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.println("* ");

        System.out.println();
        System.out.println();
    }
    public static void pattern1() {
        int row = 1;
        while(row <= 5){
            int col = 1;
            while (col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();
        System.out.println();
    }

    public static void greeting(){
        System.out.println("Good morning from Rajat");
    }
}
