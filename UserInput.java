import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inp.nextLine();

        System.out.print("Enter your Register Number: ");
        String regNo = inp.nextLine();

        System.out.print("Enter your Department: ");
        String dept = inp.nextLine();

        System.out.print("Enter your Phone Number: ");
        long phoneNo = inp.nextLong();

        System.out.print("Enter your CGPA: ");
        float cgpa = inp.nextFloat();

        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + regNo);
        System.out.println("Department: " + dept);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("CGPA: " + cgpa);

        System.out.printf(
            "\nName: %s, Register Number: %s, Department: %s, Phone Number: %d, CGPA: %.2f",
            name, regNo, dept, phoneNo, cgpa
        );

        inp.close();
    }
}