package practice;
import java.util.Scanner;

public class PalidromicSum {
    static int rev(int n,int temp){
        if(n==0)
        return temp;
        temp=(temp*10)+(n%10);
        return rev(n/10, temp);
    }
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     while(true){
            int temp=rev(n,0);
            int sum=n+temp;
            int tempSum=rev(sum,0);
            if(sum==tempSum){
                System.out.println("palidrome number"+sum);
                break;
            }
           
            else {
                n=tempSum;
                continue;

            }
           

          }
      

        
    }
    
}