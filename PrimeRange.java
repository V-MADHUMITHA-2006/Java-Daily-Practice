import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args){
         try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the starting number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
          int dig1 = i % 10;
          int dig2 = i / 10;
          int sum = dig1 + dig2;
          int product = dig1 * dig2;
          int result = sum+product;
          if (result==i){
            System.out.println(i);  
          }
        }
    
        sc.close();
    }
      }


    }
