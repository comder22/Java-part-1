import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 60){
            System.out.println("Grade C");
        }
        else if(marks >= 30){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }

    }
}
