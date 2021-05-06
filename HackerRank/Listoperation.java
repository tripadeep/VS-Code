package HackerRank;

import java.io.*;
import java.util.*;

public class Listoperation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<Integer>(n);
        while(n>0){
            l1.add(sc.nextInt());
            n--;
        }
        int q=sc.nextInt();
        while(q>0){
            String str=sc.next();
            if(str=="Insert"){
                int x=sc.nextInt();
                int y=sc.nextInt();
                l1.add(x,y);
            }
            if(str=="Delete"){
                int x=sc.nextInt();
            l1.remove(x);
                
            }
            
            q--;
        }
        for (Integer integer : l1) {
            System.out.println(integer);
        }
        
        
    }
}