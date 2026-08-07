import java.util.Scanner;
public class AvrgOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter the First Number:");
      int num1= sc.nextInt();
     System.out.println("Enter the Second Number:");
     int num2=sc.nextInt();
     double average = (num1 + num2) / 2.0;
     System.out.printf("Average of the two numbers is: %.2f", average);
     sc.close();
    }
}

