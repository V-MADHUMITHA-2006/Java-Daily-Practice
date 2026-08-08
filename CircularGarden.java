import java.util.Scanner;

public class CircularGarden {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           System.out.println("Enter the Radius :");
           Double rs=sc.nextDouble();
            Double area=3.14*rs*rs;
            System.out.println("Area of Circle is :"+area);
        sc.close();

        }
    }
}
