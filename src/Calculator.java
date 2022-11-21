import java.util.*;
public class Calculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
       double a,b;
       while (true){
        System.out.println("1-Addition");
        System.out.println("2-Substraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Exit");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter the first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                double d = a + b;
                System.out.println("Sum=" + d);
                break;
            case 2:
                System.out.println("Enter the first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                double e = a - b;
                System.out.println("Difference=" + e);
                break;

            case 3:
                System.out.println("Enter the first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                double f = a * b;
                System.out.println("Product=" + f);
                break;
            case 4:
                try {
                    System.out.println("Enter the first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    double h = a / b;
                    System.out.println("Division=" + h);
                }
                catch(ArithmeticException e1){
                    System.out.println("Division by zero");
                }
                finally {
                    System.out.println("reached");
                }
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("invalid option");
        }

        }
    }
}