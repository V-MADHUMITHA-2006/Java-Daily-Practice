public class SimpleWhile {
    public static void main(String[]args){
        int n=5;
        int num=255;
        int count=0;
        while(num>=n){
            count++;
            num=num/n;
    
        }
        System.out.println(count);


    }
}
