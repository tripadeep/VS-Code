package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**Given an array of names (connsisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. print the names of the candidates that recieved max votes. if there is tie, print lexicographiclly smaller name.
 * input 3
 * andy blake clark
 * output andy 1
  */
public class GoogleInterview {
    public static final Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int size=sc.nextInt();
        String names[]=new String[size];
        int count=0;
        String temp="";
        HashMap<String,Integer>hs=new HashMap<>();
        boolean marked[]=new boolean[size];
        Arrays.fill(marked,true);
        for(int i=0;i<size;i++){
            count++;
            if(marked[i]!=false){
                for(int j=i+1;j<size;j++){
                    if(names[i].equals(names[j])){
                        
                        marked[j]=false;
                        count++;
                        hs.put(names[i],count);

                    }
                }
            }
            else continue;     
            
        }
        System.out.print(hs);
    }
}
