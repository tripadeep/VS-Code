package practice;
import java.io.*;
import java.util.*;

public class Powerpuff{
    public static void main(String args[] ) throws Exception {
        
        //Scanner sc=new Scanner(System.in);
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
       // PrintWriter print=new PrintWriter(System.out);
        int tcase= Integer.parseInt(inp.readLine());

    //    int tcase=sc.nextInt();
        int req[]=new int[tcase];
        int total[]=new int[tcase];
    int res[]=new int[tcase];
       // int min=0;
       String str=inp.readLine();
       String[] str1=str.split(" ");
        for(int i=0;i<tcase;i++){
            

            req[i]=Integer.parseInt(str1[i]);

            
        }
        
        for(int j=0;j<tcase;j++){
            total[j]=Integer.parseInt(inp.readLine());

         }
         for(int k=0;k<tcase;k++){
            res[k]=total[k]/req[k];
            //System.out.println(res[k]);
        }
        Arrays.sort(res);
        System.out.print(res[0]);
        // BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        // int T= Integer.parseInt(inp.readLine());

   }
}