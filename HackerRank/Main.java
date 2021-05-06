package HackerRank;


import java.util.*;
import java.io.*;


public class Main {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Modify this function to process `array` as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
        int temp=0;
        ArrayList list=new ArrayList<>();
        for ( int i=0;i<array.size();i++) {
            if(array.get(i)%2==0)
            list.add(array.get(i));
            
        }
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                Integer b=(Integer)list.get(i)+(Integer)list.get(j);
                
                if(b>=20)
                temp+=1;
                break;

            }


        }
        

        return temp;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
