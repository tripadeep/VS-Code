import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DecimalToBinary {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        int n = scanner.nextInt();
        int temp;
         int count=0,res=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         //ArrayList<Integer> arr=new ArrayList<Integer>();
        while(n>0){
            temp=n%2;
            n/=2;
            if(temp==1){
                count++;
                if(count>=res)
                res=count;

            }
           
            else
            count=0;
            
            
            
        }
        System.out.println(res);
      

        scanner.close();
    }
}
