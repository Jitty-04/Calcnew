import java.util.*;
public class Calculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextInt();
        System.out.println("Enter second number");
        double b = sc.nextInt();
        System.out.println("1-Addition");
        System.out.println("2-Substraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Exit");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                double d = a + b;
                System.out.println("Sum=" + d);
                break;
            case 2:
                double e = a - b;
                System.out.println("Difference=" + e);
                break;

            case 3:
                double f = a * b;
                System.out.println("Product=" + f);
                break;
            case 4:
                double h = a / b;
                System.out.println("Division=" + h);
                break;
            case 5:
                System.exit(0);
                break;
            default:System.out.println("invalid option");

        }
    }
}