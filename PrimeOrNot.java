
import java.util.Scanner;

public class PrimeOrNot {
    
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the Value");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is prime" : " is not prime"));
    }
}

}
