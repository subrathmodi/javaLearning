import java.util.Arrays;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
//        System.out.println("enter age");
//        Scanner sc= new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age > 18){
//            System.out.println("adult");
//        }
//       else {
//            System.out.println("not adult");
//        }

//        Take input from user and show weather a number is odd or even.
//        System.out.println("enter a number");
//        Scanner num= new Scanner(System.in);
//        int number = num.nextInt();
//        if (number%2 == 0){
//            System.out.println("number is even");
//        }
//        else {
//            System.out.println("number is odd");}


//  Question - Take two numbers in input and determine weather they are equal or which is greater.




        try {
            System.out.println("Enter a");
            Scanner num1 = new Scanner(System.in);
            int a = num1.nextInt();
            System.out.println("Enter b");
            Scanner num2 = new Scanner(System.in);
            int b = num2.nextInt();
            if (a == b) {
                System.out.println("numbers are equal");
            } else if (a > b) {
                System.out.println("numbers a is greater than b");
            } else {
                System.out.println("numbers a is less than b");
            }
        }catch (Exception e){
            System.out.println("args = " + e);
            System.out.print("invalid expression");
        }
    }
}
