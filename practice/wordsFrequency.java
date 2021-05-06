package practice;
import java.io.*;
public class wordsFrequency {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();       
        String[] token=str.split(" ");
        for (String string : token) {
           int freq=frequency(string, token);
            System.out.println(string+" "+freq);
        }

    }
private static int frequency(String str,String[] token){
    int freq=0;
   int low=0;
   int high=token.length-1;
   int mid=0;
   while(low<=high){
       mid=low+high/2;
       if(token[mid]==str)
       return 1;
       else if(mid)
   }

}
}