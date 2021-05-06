package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberChoice {
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int s=sc.nextInt();
        
        int temp=(int)Math.pow(10, n);
        for(int i =temp-1;i>1;i--){
           int sum= adddigits(i);
            if(s==sum){
                System.out.println(i);
                break;
            }
        }
      
  }  
  static int   adddigits(int num)
{
    int  a = 0, digsum = 0;
    ArrayList list=new ArrayList<>();
 
    while(num!=0)
    {
         list.add( num % 10);
       digsum += (int)list.get(a);
       num /= 10;
        a = a+1;
        
    }
 
    return digsum;
}
}
