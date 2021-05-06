package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count=1,pair=0;;      // 10 20  20  10  10  30  50  10  20 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[j]==ar[i])
                count++;
                           
            }
            if(count%2==0)
            pair+=count;//4
            else
            pair=count-1;//4+2

        }

return pair/2;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

         //int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // int[] ar = new int[n];

        // String[] arItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int arItem = Integer.parseInt(arItems[i]);
        //     ar[i] = arItem;
        // }.
        int [] ar=new int[]{10,20,20,10,10,30,50,10,20};

        int result = sockMerchant(9, ar);
        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
