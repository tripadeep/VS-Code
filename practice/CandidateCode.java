/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/
package practice;
import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int tcase=0;
        tcase=sc.nextInt();
        Integer req[]=new Integer[tcase];
        Integer total[]=new Integer[tcase];
         Integer res[]=new Integer[tcase];
        int min=0;
        
        tcase=sc.nextInt();
        for(int i=0;i<tcase;i++){
            req[i]=sc.nextInt();
        }
        for(int j=0;j<tcase;j++){
            total[j]=sc.nextInt();
        }
         for(int k=0;k<tcase;k++){
            res[k]=total[k]/req[k];
            System.out.print(res[k]);
        }
       
       /*for(int i=0;i<tcase;i++){
        // min=res[0];
         // min = Collections.min(Arrays.asList(res)); 
         System.out.print(res[i]);
        }
        //System.out.print(min);
       */


   }
}
