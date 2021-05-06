package hackerearth;

import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class ConfusingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //ArrayList a = new ArrayList();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //ArrayList b = new ArrayList();
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int k=i;
            int j=0;
            int c=0;
            int l=i;
            while(j<n){
                if(a[j]>=a[i]){
                    if(j<i && c==0){
                        k=j;
                        c=k;
                    }
                    l+=1;
                    if(l>n)
                    l=n;
                
                }
                j+=1;
                for(int d=0;d<k&&d<l;d++){
                    arr[d]+=b[i];
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }


    }

}