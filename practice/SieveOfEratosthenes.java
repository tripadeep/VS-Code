package practice;

import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
    int n=100;
    //boolean primeList[]=new boolean[n+1];
    isPrime(n);  
    
    }
    static void isPrime(int n){
        boolean[] temp=new boolean[n+1];
        Arrays.fill(temp,true);
        temp[0]=temp[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(temp[i]){
                for(int j=2;i*j<=n;j++){
                    temp[i*j]=false;
                }
            }           

        }
        for(int i=2;i<temp.length;i++){
            if(temp[i])
            System.out.println(i);
        }
       // return temp;
    }
    
}
