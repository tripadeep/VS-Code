package hackerearth;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;
public class MaximmizeModuloProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int M=sc.nextInt();
            BigInteger K=sc.nextBigInteger();
            String N=sc.next();
            BigInteger bg=new BigInteger(N);
            int compare=-1;
            BigInteger[] res=new BigInteger[M+1];  
            res[0]=bg.mod(K);      
            for(int i=0;i<M;i++){
                StringBuilder sb=new StringBuilder(N);
                compare = bg.compareTo(K);
                if(compare==1)
                sb.deleteCharAt(i);
                res[0]=bg.mod(K);            
            }
            Arrays.sort(res);
            System.out.println(res[M]);           
        }        
        sc.close();
    }
}
