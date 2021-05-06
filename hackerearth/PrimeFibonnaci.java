package hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import javafx.beans.property.IntegerProperty;

public class PrimeFibonnaci {
    public static int isPrime(int n){
        //int prime=0;
        if( n == 1) return 0;
        int i =2;
        while(i * i <= n){ if(n % i == 0) return 0; i++;}
        return 1;


        
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
         ArrayList<String> l1 = new ArrayList<String>();
         ArrayList<String> l2 = new ArrayList<String>();
        final int num1 = sc.nextInt();
        final int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
             int temp = isPrime(i);
             if(temp==1){
                 
                 l1.add(Integer.toString(i));
             }                
     }
    // System.out.println(l1);
     String frnames[]=l1.toArray(new String[l1.size()]);
     for(int i=0;i<frnames.length;i++){
         for(int j=0;j<frnames.length;j++){
             if(j != i){
                 l2.add(frnames[i]+frnames[j]);

             }

         }
     }//System.out.println(l2);
     String primelist[]=l2.toArray(new String[l2.size()]);
     int Arr[]=new int[primelist.length];
     for(int i=0;i<primelist.length;i++){
         Arr[i]=Integer.parseInt(primelist[i]);
         

     }
    //  for (int i : Arr) {
    //      System.out.println(i);
    //  }
     LinkedHashSet<Integer>l3=new LinkedHashSet<Integer>();
     for (int i = 0; i <= Arr.length-1; i++) {
        int temp = isPrime(Arr[i]);
        if(temp==1){
            
            l3.add(Arr[i]);
        }   
        }
      ArrayList<Integer> arl=new ArrayList<Integer>(l3);



   //Collections.sort(l3);
   long smallest=arl.get(0);
   long largest=arl.get(arl.size()-1);
   long fibArr[]=new long[arl.size()];

   fibArr[0]=smallest;
   fibArr[1]=largest;
   for(int i=2;i<fibArr.length;i++){

    fibArr[i]=smallest+largest;
    smallest=largest;
    largest=fibArr[i];

   
       
   }
   System.out.println(fibArr[fibArr.length-1]);
  
    }
}