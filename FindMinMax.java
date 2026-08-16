import java.util.Scanner;

public class FindMinMax{
    public static void findMin(int[] nums){
        int min= nums[0];
        for(int i=1; i<nums.length;i++){
          if(nums[i]<min){
            min=nums[i];
        }
    }
    System.out.println("Minimum Value ="+min);
    }
    public static void findMax(int[] nums){
        int max= nums[0];
        for(int i=1; i<nums.length;i++){
          if(nums[i]>max){
            max=nums[i];
        }

    }
     System.out.println("Minimum Value ="+max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
            
        }
        findMax(nums);
        findMin(nums);
        sc.close();


    }
}