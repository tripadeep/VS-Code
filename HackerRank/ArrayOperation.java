package HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(final String[] args) throws IOException {
        //final BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        
        final int n = sc.nextInt();
        
         ArrayList[] al = new ArrayList[n];
        
   for(int i=0;i<n;i++){
    final int d=sc.nextInt();
       al[i]=new ArrayList();
       for(int j=0;j<d;j++)
       al[i].add(sc.nextInt());
   }
    int q = sc.nextInt();
   while(q>0){
       final int x=sc.nextInt();
       final int y=sc.nextInt();
       try{
        System.out.println(al[x-1].get(y-1));
    }
    catch(Exception e){
        System.out.println("ERROR!");
    }
     q--;

       }
       
    }
    


    
}
4 13 14 16 15
16 15
 14 13 4