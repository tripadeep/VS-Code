package practice;
import java.util.*;
class IsPrinmeno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        boolean flag=false;
        if(n>1){
            for(int i=2;i<=n/2;i++){
                if(n%i==0)
                flag=true;

            }
    
        }
        else System.out.println("enter greater than 1 ");
        String str=(flag==true)?"not Prime no":" prime no.";
        System.out.println(str);
    }
}