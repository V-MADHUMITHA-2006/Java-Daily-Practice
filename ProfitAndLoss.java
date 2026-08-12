import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int amt=sc.nextInt();
        if(amt>0){
            System.out.println("Profit");

        }else if (amt<0) {
            System.out.println("Loss");

            
        }else{
            System.out.println("NO Profit And Loss");
        }

sc.close();
    }
    
}
