import java.util.*;
public class square{

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        for(int row = 1; row<=n; row++){

            for(int col=1 ; col<=row; col++){

                if(row==1||row==n||col==1||col==n){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
        

    }
    
    
}