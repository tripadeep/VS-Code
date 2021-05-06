package hackerearth;

import java.io.*;
import java.util.*;


public class MaximumDisttance{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int Q = Integer.parseInt(br.readLine().trim());
         int[][] Queries = new int[Q][2];
         for(int i_Queries = 0; i_Queries < Q; i_Queries++)
         {
         	String[] arr_Queries = br.readLine().split(" ");
         	for(int j_Queries = 0; j_Queries < arr_Queries.length; j_Queries++)
         	{
         		Queries[i_Queries][j_Queries] = Integer.parseInt(arr_Queries[j_Queries]);
         	}
         }

         long[] out_ = solve(Q, Queries);
         System.out.print(out_[0]);
         for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }

         wr.close();
         br.close();
    }
    static long[] solve(int Q, int[][] Queries){
       // Write your code here
       List<Long>l=new ArrayList<Long>();
       List<Long>l1=new ArrayList<Long>();
       long sum=0;
       for(int i=0;i<Q;i++){
           int index=0;
               if(Queries[i][0]==1){
                   Long l2=Long.valueOf(Queries[i][1]);
                   l.add(l2);
               }
               if(Queries[i][0]==2){
                   l.remove(index);
               }
               if(Queries[i][0]==3){
                   Long n=Collections.min(l);
                  // System.out.println(n);
                   
                   Long l3=Long.valueOf(Queries[i][1]);
                   sum=sum+Math.abs(l3-n);
                   
                   l1.add(sum);
               }
           
       }
      
       long []arr=new long[l1.size()];
       int i=0;
       for( Long value:l1){
           arr[i++]=value;
       }
       return arr;
    
    }
}