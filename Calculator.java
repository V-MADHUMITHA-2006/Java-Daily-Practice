import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value a: ");
        float a = sc.nextFloat();
        System.out.println("Select the operator: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter The value b:");
        float b =sc.nextFloat();
        switch (ch) {
    case '+':
        System.out.println("Sum: " + (a + b));
        break;

    case '-':
        System.out.println("Subtraction: " + (a - b));
        break;

    case '*':
        System.out.println("Multiplication: " + (a * b));
        break;

    case '/':
        System.out.println("Division: " + (a / b));
        break;

    default:
        System.out.println("Invalid Operator");
}  
sc.close();  
        
    }}

