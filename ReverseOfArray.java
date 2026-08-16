import java.util.Scanner;

public class ReverseOfArray {

    public static void main(String[] args) {

         try(Scanner sc = new Scanner(System.in)){

        System.out.println("Enter the Array Size =");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Reversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
}