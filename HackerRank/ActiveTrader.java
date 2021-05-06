package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
    // Write your code here
    HashSet<String> temp=new HashSet<String>();
    temp.addAll(customers);
    List<String> finall=new ArrayList<String>();
    finall.addAll(temp);
    for(int i=0;i<finall.size();i++){
        for(int j=0;j<customers.size();j++){
            if(finall.get(i)==customers.get(j)){
                
            }
        }
    }
    

    return finall;


    }
    

}

public class ActiveTrader {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc=new Scanner(System.in);

        int customersCount = sc.nextInt();

        List<String> customers = new ArrayList<>();

        for (int i = 0; i < customersCount; i++) {
            String customersItem =sc.next();
            customers.add(customersItem);
        }

        List<String> result = Result.mostActive(customers);

        for (int i = 0; i < result.size(); i++) {
           System.out.println(result.get(i));

            // if (i != result.size() - 1) {
            // System.out.println("\n");
            // }
        }

        //bufferedWriter.newLine();
        // System.out.println("\n");

        // bufferedReader.close();
        // bufferedWriter.close();
        sc.close();
    }
}
